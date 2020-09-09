const createBtn = document.querySelector('.createBtn');
const deleteBtn = document.querySelector('.deleteBtn');
const saveBtn = document.querySelector('.saveBtn');
const printBtn = document.querySelector('.printBtn');
let arr;

function createArr(){
  arr = [];
  console.log(arr);
}

function saveArr() {
  const input = document.querySelector('#valueInput');
  arr.push(input.value);
  input.value = null;
  input.focus();
  console.log(arr);
}

function delArr() {
  arr = [];
  printArr();
  console.log(arr);
}

function printArr() {
  let mesg = "";
  arr.forEach(i => {
    mesg += `${i} <br>`;
  });
  document.querySelector("#result").innerHTML = mesg;
  console.log(arr);
}
function init() {
  createBtn.addEventListener('click', createArr);
  saveBtn.addEventListener('click', saveArr);
  deleteBtn.addEventListener('click', delArr);
  printBtn.addEventListener('click', printArr);
}
init();

