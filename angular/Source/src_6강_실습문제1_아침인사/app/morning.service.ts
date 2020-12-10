import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MorningService {

  constructor() { }
  sayHello(code:string):string{
    var mesg="";
    if(code=="KR"){
      mesg="안녕하세요";
    }else if(code=="US"){
      mesg="Good Mornig";
    }else if(code=="CN"){
      mesg="짜오"
    }else if(code=="JP"){
      mesg="오하요 고자이 마스";
    }
    return mesg;
  }
}
