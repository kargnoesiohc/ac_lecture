import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '이벤트 바인딩 실습';
  handleEvent(event):void{
    console.log("handleEvent====", event);
  }
  handleEvent2(event, name:string ):void{
    console.log("handleEvent2====", event, "\t", name );
  }
}
