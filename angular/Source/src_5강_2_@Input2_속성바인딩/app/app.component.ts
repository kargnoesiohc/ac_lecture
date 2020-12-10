import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'chul-app';
  //자식에게 전달할 데이터
  app_username="홍길동";
  app_userage=20;
}
