#!/usr/bin/env phantomjs

// This script looks at the HTML files in the offline folder
// and isolates the markdown section in each page.

var page = require('webpage').create();
var fs = require('fs');

page.onConsoleMessage = function (msg) { console.log(msg); };

function fixPage() {
  // executed inside page

  var file = document.querySelector('.file');
  file.style.marginTop = "0";
  document.body.innerHTML = file.outerHTML;
  document.querySelector('.file-header').innerHTML = "";

  document.body.style.width = "900px";

  var links = document.querySelectorAll('a');
  var i, link;
  for (i=0, len=links.length; i<len; i++) {
    link = links[i];
    if (link.id) {
      link.id = link.id.replace("user-content-", "");
    }
  };
}

function handlePage(file) {
  console.log("\n\nCLEANING", file);
  page.open(file, function () {
      page.evaluate(fixPage);
      fs.write(file, page.content, 'w');
      nextPage();
  });
}

function getHtmlFiles(path) {
  return fs.list(path)
           .filter(function(x) { return /\.html/.test(x); })
           .map(function (x) { return path + x; });
}

var rootPath = "offline/github.com/cljsinfo/api-refs/blob/catalog/";
var refsPath = rootPath + "refs/";
var pages = getHtmlFiles(rootPath)
             .concat(getHtmlFiles(refsPath));

function nextPage() {
  var file = pages.shift();
  if (!file) { phantom.exit() }
  handlePage(file);
}

nextPage();
