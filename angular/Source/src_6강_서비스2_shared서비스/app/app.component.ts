import { Component } from '@angular/core';
import {SharedService} from './shared.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [SharedService] //서비스등록
})
export class AppComponent {
  title = '서비스의 공유';
  //생성자를 통해 주입
  constructor(public service:SharedService){
    
  }
  addName(n:string){
    this.service.addName(n);
    console.log(this.service.names);
  }
}
