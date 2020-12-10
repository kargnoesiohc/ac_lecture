import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MorningService {

  constructor() { }
  //code 입력받고 인사말 반환
  morning(code:string):string{
    var mesg = "";
    if(code == 'KR'){
       mesg = "안녕하세요. 좋은 아침입니다.";
    }else if(code == 'US'){
     mesg = "Good Morning.";
   }else if(code == 'CN'){
     mesg = "짜오 안.";
   }else{ 
     mesg = "오하이요~ 고자이마스";
   }
   return mesg;
 }
}
