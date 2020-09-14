//주민번호에서  생년월일 반환

function func07(birth) {
  return birth.substr(0,6);
}

document.write(func07('911025-1234567'));