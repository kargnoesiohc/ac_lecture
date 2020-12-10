import { Component, OnInit} from '@angular/core';
import {Input} from '@angular/core';
import { Stock } from '../stock';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  //Stock ng g interface stock , import Input
@Input() iStock:Stock;
stockSymbol:string="";
stockPrice:number=0;

handleEvent(){
  this.stockSymbol= this.iStock.stockSymbol;
  this.stockPrice= this.iStock.stockPrice;
}
  constructor() { }

  ngOnInit(): void {
  }

}
