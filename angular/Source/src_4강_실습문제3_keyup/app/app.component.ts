import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title="이벤트  바인딩 실습예제3";
  input_mesg_count=0;
  handleEvent(event){
    this.input_mesg_count=event.target.value.length;
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