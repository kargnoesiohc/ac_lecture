const addBtn = document.querySelector('.addBtn');
const listBtn = document.querySelector('.listBtn');
const delBtn = document.querySelector('.delBtn');


function deleteEmp() {
    location.href = `EmpDeleteServlet?empno=${delBtn.value}`;
}

function paintList() {
    location.href ='EmpListServlet';
}


function addEmp() {
    location.href = 'EmpWriteFormServlet';
}

function init() {
    if(addBtn != null) addBtn.addEventListener('click', addEmp); 
    if(listBtn != null) listBtn.addEventListener('click', paintList);
    if(delBtn != null)  delBtn.addEventListener('click', deleteEmp); 
}
init();