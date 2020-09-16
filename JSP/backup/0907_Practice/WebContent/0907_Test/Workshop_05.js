// 파라미터 값들 중 짝수의 합 리턴

function even(a,b,c,d,e) {
  let sum = 0;
  if (a%2==0) {
    sum += a;
  }
  if (b%2==0) {
    sum += b;
  }
  if (c%2==0) {
    sum += c;
  }
  if (d%2==0) {
    sum += d;
  }
  if (e%2==0) {
    sum += e;
  }

  return sum;
}

console.log(even(1,2,3,4,5));