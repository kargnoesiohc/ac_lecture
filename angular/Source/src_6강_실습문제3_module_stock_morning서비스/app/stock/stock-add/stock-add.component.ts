import { Component, OnInit,Output,EventEmitter } from '@angular/core';
import {Stock} from '../stock';

@Component({
  selector: 'app-stock-add',
  templateUrl: './stock-add.component.html',
  styleUrls: ['./stock-add.component.css']
})
export class StockAddComponent implements OnInit {
  stock:Stock;
  //1.stock에 데이터 저장
  //2.부모컴포넌트에 stock 전달 : @Output() +이벤트(eventEmitter)
  @Output() customEvent= new EventEmitter<Stock>();
  add(s:Stock){
    this.stock=s;
    this.customEvent.emit(this.stock);//데이터 전달
  }
  constructor() { }

  ngOnInit(): void {
  }

}
