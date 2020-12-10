import { Component, OnInit } from '@angular/core';
import {SharedService} from '../shared.service'
@Component({
  selector: 'app-woman',
  templateUrl: './woman.component.html',
  styleUrls: ['./woman.component.css'],
  providers: [SharedService]
})
export class WomanComponent implements OnInit {
  constructor(public serivce:SharedService) { }
  addName(n:string){
    this.serivce.addName(n);
    console.log(this.serivce.names);
  }
 

  ngOnInit(): void {
  }

}
