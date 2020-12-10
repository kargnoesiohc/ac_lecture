import { Component } from '@angular/core';
import {HelloService} from './hello.service'//임포트

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [HelloService]  //서비스provider등록
})
export class AppComponent {
  title = 'chul-app';
  //생성자를 이용한 의존성 주입
  constructor(public helloService:HelloService){
    
  }
}
