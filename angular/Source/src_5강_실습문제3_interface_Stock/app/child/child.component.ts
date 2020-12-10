import { Component, OnInit, Input } from '@angular/core';
import {Stock} from '../stock';
@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Input() iStocks:Stock[];
  showStocks:Stock[];
  handleEvent(){
    this.showStocks= this.iStocks;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
