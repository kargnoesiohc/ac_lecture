const parBtn1 = document.querySelector('.parBtn1');
const parBtn2 = document.querySelector('.parBtn2');
const parBtn3 = document.querySelector('.parBtn3');


let web;
parBtn1.addEventListener('click', () => { web = window.open("child.html","_blank","width=300p, height=300px")});
parBtn2.addEventListener('click', () => web.close());
parBtn3.addEventListener('click', () => window.close());

// 자신이 open한 창이 아니면 닫히지 않음