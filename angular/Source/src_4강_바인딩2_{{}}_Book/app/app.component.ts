import { Component } from '@angular/core';
import {Person} from './person';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '바인딩실습';
  
  user:Person= {
    name:"홍길동",
    age:20,
    address:"서울"
  }
}
