//export default는 이름 변경가능
//export는 그대로 사용
 import {Employee, bbb} from './b.js';
/* import {default as xxx} from './c.js'; //이름변경
 import defaultExport  from './c.js';*/
 import ccc  from './c.js';
ccc();




 var e = new Employee("홍길동",200);
 console.log(e.getEmployee());
 bbb();
 xxx();
 defaultExport();

//aaa();

 
 