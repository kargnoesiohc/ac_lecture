const input = document.querySelector('#str');
const btn = document.querySelector('.js_btn');
const str1 = document.querySelector('#str1');
const str2 = document.querySelector('#str2');
const str3 = document.querySelector('#str3');
const str4 = document.querySelector('#str4');
const str5 = document.querySelector('#str5');
const str6 = document.querySelector('#str6');
const str7 = document.querySelector('#str7');
const str8 = document.querySelector('#str8');

function paintInfo(event) {
  event.preventDefault();
  str1.innerText = input.value.length;
  str2.innerText = input.value.split("");
  str3.innerText = input.value.toUpperCase();
  str4.innerText = input.value.toLowerCase();
  str5.innerText = input.value.split("").reverse().join("");
  str6.innerText = input.value.charAt(0);
  str7.innerText = input.value.substr(2,1);
  str8.innerText = input.value.substring(0,5);
}

function init(){
  btn.addEventListener('click', paintInfo)
}

init();