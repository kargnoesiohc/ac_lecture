//배열 중 최대 값
function max(arr) {
  let maxNum = 0;
  for(let i=0;i<arr.length;i++){
    if(maxNum < arr[i]){
      maxNum = arr[i];
    }
    document.write(`배열 값 : ${arr[i]} <br>`);
  }
  return maxNum;
}

function asc(arr) {
  return arr.sort((a,b) => (a-b)); //오름차순
  // return arr.sort((a,b) => b-a); //내림차순
}
const arr = [11,2,33,54,5];

document.write(`최대값 : ${max(arr)} <br>`);
document.write(`오름차순 정렬 : [${asc(arr)}]`);




