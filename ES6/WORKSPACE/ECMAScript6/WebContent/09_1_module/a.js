import {Person, bbb} from "./b.js"   //export class, function
import ccc from "./c.js" //ccc() 호출    // export default 경우 
//import {default as kkk} from "./c.js" 
import defaultExport from "./c.js"//defaultExport() 호출



ccc();
var p= new Person("홍길동");
bbb();
//kkk();   //c.js
defaultExport(); //ccc()호출 world출력 
console.log(">>>>", p.name);
//ccc();