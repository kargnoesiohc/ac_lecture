const v1 = document.querySelector("#v1");
const result = document.querySelector("#result");
const btn = document.querySelector('.btn');

function sum(){
  let arr = v1.value.split("/").map(Number);
  let sumNum = 0;
  arr.forEach((i) => {
  sumNum += i;
});
result.innerText = sumNum;
}

function handleSum(){
  btn.addEventListener('click', () => sum());
}
handleSum();