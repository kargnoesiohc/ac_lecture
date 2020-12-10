import { Component, Input,Output, EventEmitter, OnInit } from '@angular/core';
import {Book} from './book';
//import In, Out, EventEmitter
@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})

export class BookComponent  {//implements OnInit 삭제 또는 // ngOnInit(): void{} 구현
  @Input() bookList:[];
  @Input() title:string;

  @Output() customEvent= new EventEmitter();  //Event명칭은 customEvent
  send(bname){
    console.log(bname);
    this.customEvent.emit(bname);
  }
  
 
}
