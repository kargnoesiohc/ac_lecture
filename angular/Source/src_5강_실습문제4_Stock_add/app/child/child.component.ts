import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import {Stock} from '../stock';
@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
 @Output() customEvent= new EventEmitter();
 stock:Stock;
 add(data:Stock){
  this.stock=data;
    this.customEvent.emit(data);
 }
  constructor() { }

  ngOnInit(): void {
  }

}
