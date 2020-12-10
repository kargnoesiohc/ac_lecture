import { Component, OnInit } from '@angular/core';
import {Input} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  title="부모 컴포넌트에서 데이터 전달";
@Input() username;
@Input() userage;
  constructor() { }
  ngOnInit(): void {
  }

}
