let arr = [1,2,3];
arr.push(4);

arr.forEach(item => console.log(item)); //foreach -> Array객체에만 가능

for(let i of arr) {
  console.log(i); //for ...of -> 배열 순환(배열 요소에 접근)
}

for(let i in arr) {   //for ...in -> 객체 순환 (프로퍼티에 접근(키 값))
  console.log(i);
}



