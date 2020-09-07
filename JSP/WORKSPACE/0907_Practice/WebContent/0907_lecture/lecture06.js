function plus(a,b,callback) {
  let sum = a+b;
  callback(sum);
}

function print(result) {
  console.log(result);
}

plus(1,2,print);