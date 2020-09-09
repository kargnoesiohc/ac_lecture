const btnGoogle = document.querySelector('.js_btnGoogle');
const inputSite = document.querySelector('#site');
const btnSite = document.querySelector('.js_btnSite');

function handleGoogle() {
  btnGoogle.addEventListener('click', () => location.href="https://www.google.com")
}

function handleSite() {
  btnSite.addEventListener('click', () => location.href=inputSite.value)
}

function init() {
  handleGoogle();
  handleSite();
}

init();