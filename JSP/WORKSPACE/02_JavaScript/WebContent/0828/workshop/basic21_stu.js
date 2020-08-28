const x = parseInt(prompt("1~20사이 정수 입력"));
const n = parseInt(prompt("배수로 쓰일 정수 입력"));
const m = parseInt(prompt("배수로 쓰일 정수 입력"));

  function multipleOf2or3(x,n,m){
    let result = 0;
    for(let i=1;i<=x;i++){
      if(i%n!=0 && i%m!=0){
        result += i;
      }
    }
    console.log(`입력값 : ${x}, ${n}, ${m} -> 결과 값: ${result}`);
  } 
  multipleOf2or3(x,n,m);