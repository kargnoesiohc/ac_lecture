const jsBtn = document.querySelector('.js_btn'),                                      
    bName = document.querySelector('#bName'),
    bVersion = document.querySelector('#bVersion'),
    bOnLine = document.querySelector('#bOnLine');
function browserInfo(event) {
  event.preventDefault();
  bName.innerText = navigator.appName;
  bVersion.value = navigator.appVersion;
  bOnLine.innerText = navigator.onLine;
}

function init() {
  jsBtn.addEventListener('click', browserInfo);
}

init();