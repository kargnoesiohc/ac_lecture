const func08  = birth => { 
   const gender = birth.substr(7,1);
   if(gender == '1'){
     return '남';
   } else {
     return '여';
   }
}; 
const birth = '961120-1234567'
document.write("생년월일 : " + birth.substr(0,6) + "<br>");
document.write("성별 : "+func08(birth));