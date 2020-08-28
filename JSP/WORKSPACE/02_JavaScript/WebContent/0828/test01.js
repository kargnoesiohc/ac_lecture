let result = document.querySelector('.js-result');
let span = document.querySelector('.js-span');

function gugudan() {
  // 구구단(입력한 숫자의 단만 출력)
  let n = parseInt(prompt("정수를 입력하시오.","2"));
  for(let i=1;i<=9;i++){
    result.innerHTML += `${n} X ${i} = ${i*n} <br/>`;
  }
}

function gugudanAll(){
  for(let i=2; i<=9;i++){
    for(let j=1;j<=9;j++){
      result.innerHTML += `${i} X ${j} = ${i*j} <br/>`;
    }
    result.innerHTML += '<br/>';
  }
}


function starPaint() {
//x: 출력할 줄 수, y: 출력할 문자(별찍기)
let x = parseInt(prompt("정수를 입력하시오.","2"));
let y = prompt("아무거나 입력");
  for(let i=0;i<x;i++){
    for(let j=0;j<=i;j++){
      result.innerHTML += `${y}`;
    }
    result.innerHTML += '<br/>';
  }
}

function oneToHundred(){
  let result = "";
  for(let i=1;i<=100;i++){
    span.innerHTML += `${i} `;
    result += `${i} `;
    if(i%10 == 0){
      span.innerHTML += "<br/>";
      result += "\n";
    }
  }
  console.log(result);
}
// gugudan();
// starPaint();
// gugudanAll();
oneToHundred();