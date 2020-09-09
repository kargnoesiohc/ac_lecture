const saveBtn = document.querySelector(".saveBtn");
const printBtn = document.querySelector(".printBtn");

let data = [];

function savePerson() {
  const username = document.querySelector("#username");
  const age = document.querySelector("#age");
  const address = document.querySelector("#address");
  const person = {
    username: username.value,
    age: age.value,
    address: address.value,
  }
  data.push(person);
  document.querySelector('#result').innerHTML="<h3>저장 완료</h3>"
  username.value = null;
  age.value = null;
  address.value = null;
}

function printPerson() {
  let info = "";
  data.forEach((i,no) => {
    let person = i;
    info += `<br> ${(++no)} 번째 고객<br>`;
    info += `이름 : ${person.username}<br>`
    info += `나이 : ${person.age}<br>`
    info += `주소 : ${person.address}<br>`
  });
  document.querySelector("#result").innerHTML = info;
}

function init() {
  saveBtn.addEventListener('click', savePerson);
  printBtn.addEventListener('click', printPerson);
}

init();