import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title="이벤트  바인딩 실습예제2";
  flag=true;
  handleEvent(flag:boolean){
    this.flag= flag;
  }
   
}
//app.module 파일에 
//import {FormsModule} from '@angular/forms'이 필요함

// @NgModule({
//   declarations: [
//     AppComponent
//   ],
//   imports: [
//     BrowserModule,
//     AppRoutingModule,
//     FormsModule   //필요함
//   ],