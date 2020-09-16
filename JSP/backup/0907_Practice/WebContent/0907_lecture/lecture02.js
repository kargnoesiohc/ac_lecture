function aaa(num) {
  console.log("aaa 함수" + num);
}

let xxx = aaa;
xxx(100);
aaa(200);

const func4 = function(num){
  console.log("func4" + num);
}

console.log(func4);

const func5 = new Function("x","y", "return x/y");
console.log(func5(100,300));