import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title="template reference variable #var 실습";
  flag=false; //전체 선택 checkbox상태값 설정 
  callPhone(m:string){
    console.log(m);
  }
  change(m:string){
    console.log(m);
  }
  check(m:boolean){
    console.log(m);
    this.flag=m;
  }
}
