import { Component, Input, OnInit } from '@angular/core';
import {Book} from './book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})

export class BookComponent  {//implements OnInit 삭제 또는 // ngOnInit(): void{} 구현
  @Input() bookList:[];
  @Input() title:string;
  
 
}
