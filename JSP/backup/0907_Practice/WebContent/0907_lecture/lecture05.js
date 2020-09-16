function makeFactorialFunc() {
  return function(x) {
    if(x<=1) return 1;
    return x * arguments.callee(x-1);// 현재 실행함수
  }
}

function test1() {
  return function test2(x) {
    if(x<=1) return 1;
    return x*test2(x-1);
  }
}

let rs = test1();
rs = rs(5);
console.log(rs);

const result = makeFactorialFunc()(5);
console.log(result);