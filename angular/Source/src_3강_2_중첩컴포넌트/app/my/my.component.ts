import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-my',  //my component의 선택자
  templateUrl: './my.component.html',
  styleUrls: ['./my.component.css']
})
export class MyComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
