import { Component, OnInit } from '@angular/core';
import {SharedService} from '../shared.service'

@Component({
  selector: 'app-man',
  templateUrl: './man.component.html',
  styleUrls: ['./man.component.css']
})
export class ManComponent implements OnInit {

  constructor(public serivce:SharedService) { }
  addName(n:string){
    this.serivce.addName(n);
    console.log(this.serivce.names);
  }
  ngOnInit(): void {
  }

}
