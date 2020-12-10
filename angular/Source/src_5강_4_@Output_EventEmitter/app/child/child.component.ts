import { Component, OnInit } from '@angular/core';
import {Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  //부모에게 사용자 정의 이벤트 전달할 EventEmitter객체
  @Output() customEvent =    new EventEmitter();

  send(name){
      this.customEvent.emit(name); //부모에게 데이터 전달
  }
  constructor() { }

  ngOnInit(): void {
  }

}
