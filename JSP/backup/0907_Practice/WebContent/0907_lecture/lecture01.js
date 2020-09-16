function myMax(n, n2) {
  let maxValue = n;
  // if(n<n2){
  //   maxValue = n2;
  // }
  // return maxValue;
  return (n>n2)?n:n2;
}
const result = myMax(10,20);
document.write(result);