function aaa() {
  console.log("aaa함수");
}

function bbb(x) {
  console.log("bbb함수");
  x();
}

bbb(aaa);