import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '속성바인딩실습';
  imgName="../assets/image/a.jpg";
  imgWidth=200;
  imgHeight=200;
}
