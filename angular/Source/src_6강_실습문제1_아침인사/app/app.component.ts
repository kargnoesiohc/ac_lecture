import { Component } from '@angular/core';
import {MorningService} from './morning.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[MorningService]
})
export class AppComponent {
  title = '국가별 아침인사 서비스 실습';
  country_code="";
  mesg="";
  constructor(public service:MorningService){}
  sayHello(event){
    this.country_code=event.target.value;
    this.mesg= this.service.sayHello(this.country_code);
  }
}
