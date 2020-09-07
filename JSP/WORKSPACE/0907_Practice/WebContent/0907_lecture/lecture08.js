const parBtn1 = document.querySelector('.parBtn1');
const parBtn2 = document.querySelector('.parBtn2');
const parBtn3 = document.querySelector('.parBtn3');
const chiBtn1 = document.querySelector('.chiBtn1');
const chiBtn2 = document.querySelector('.chiBtn2');

let web;
parBtn1.addEventListener('click', () => { web = window.open("child.html","child","width=300p, height=300px")});
parBtn2.addEventListener('click', () => web.close());
parBtn3.addEventListener('click', () => close());

