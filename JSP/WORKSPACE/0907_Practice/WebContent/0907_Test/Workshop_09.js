function func09(str) {
  let result = '';
  result += str.toUpperCase() + ' ';
  result += str.toLowerCase() + ' ';
  result += str.split("").reverse().join(""); //문자열을 배열로 변환 후 배열을 뒤집은 후 다시 배열을 문자열로 변환 - 
  //문자열.split("구분자").reverse().join("구분자");
  return result;
}

const data = func09('AbCDeF');
console.log("데이터 : ", data);