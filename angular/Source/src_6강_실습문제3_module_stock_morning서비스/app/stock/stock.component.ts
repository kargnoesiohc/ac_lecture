import { Component, OnInit } from '@angular/core';
import {Stock} from './stock';

@Component({
  selector: 'app-stock',
  templateUrl: './stock.component.html',
  styleUrls: ['./stock.component.css']
})
export class StockComponent implements OnInit {
//Stock의 배열 
stocks:Stock[]=[];
handleEvent(stock:Stock){
  this.stocks.push(stock);
}
  constructor() { }

  ngOnInit(): void {
  }

}
