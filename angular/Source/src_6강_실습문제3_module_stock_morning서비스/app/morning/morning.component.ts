import { Component, OnInit } from '@angular/core';
import {MorningService} from './morning.service';

@Component({
  selector: 'app-morning',
  templateUrl: './morning.component.html',
  styleUrls: ['./morning.component.css'],
  providers:[MorningService]
})
export class MorningComponent implements OnInit {

  constructor(public service:MorningService) { }
  mesg="";
  handleEvent(code:string){
    this.mesg=this.service.morning(code);
  }
  ngOnInit(): void {
  }

}
