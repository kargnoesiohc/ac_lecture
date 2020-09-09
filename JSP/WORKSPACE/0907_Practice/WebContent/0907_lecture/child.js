const chiBtn1 = document.querySelector('.chiBtn1');
const chiBtn2 = document.querySelector('.chiBtn2');

chiBtn1.addEventListener('click', () => self.close());
chiBtn2.addEventListener('click', () => opener.close());
