function myAge(ssn){
  const myYear = ssn.split("/")[0];
  const currYear = new Date().getFullYear();
  const age = parseInt(currYear) - parseInt(myYear) + 1;

  return age;
}

const ssn = "1981/10/20";
document.write(`현재 나이 : ${myAge(ssn)}`);