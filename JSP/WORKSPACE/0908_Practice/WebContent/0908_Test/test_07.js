const input = document.querySelector('#v1');
const btn = document.querySelector('.btn');
function wordsNum() {
  const result = document.querySelector('#result');

  const word = input.value.split(" ");
  
  result.innerHTML += `단어 수 : ${word.length} <br>`;

  lettersNum();
}


function lettersNum() {
  const result = document.querySelector('#result');
  const letter = input.value.replace(/ /g,""); // /g: 전체 모든 문자열을 변경 
  console.log(letter);

  result.innerHTML += `단어 수 : ${letter.length} <br>`;
}


function init() {
  btn.addEventListener('click', wordsNum);
}
init();