import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'chul-app';
  response="";

  handleEvent(event){ 
    this.response= event; //이벤트에 담겨서 전송
  }
}
