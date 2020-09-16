const input = document.querySelector('#v1');
const btn = document.querySelector('.btn');

let arr = input.value.split(",").map(Number);

function arrSum() {
  const result = document.querySelector('#result');
  let sumNum = 0;
  arr.forEach((i) => {
    sumNum += i;  
  });
   result.innerHTML += `합계 : ${sumNum} <br>`;
   arrAvg();

}

function arrAvg() {
  const result = document.querySelector('#result');

  let avgNum = 0;
  arr.forEach((i) => {
    avgNum += i;  
  });
  avgNum = avgNum/arr.length;
   result.innerHTML += `평균 : ${avgNum.toFixed(2)} <br>`;
   arrMedian();
}

function arrMedian() {
  const result = document.querySelector('#result');

  let medianNum = 0;
  arr.sort((a,b) => a-b);
  let center = arr.length/2;
  if(arr.length%2==1) {
    medianNum = arr[center];
  } else {
    medianNum = (arr[center-1] + arr[center])/2; 
  }
  result.innerHTML += `중앙값 : ${medianNum} <br>`;
}

function init() {
  btn.addEventListener('click', arrSum);
}
init();