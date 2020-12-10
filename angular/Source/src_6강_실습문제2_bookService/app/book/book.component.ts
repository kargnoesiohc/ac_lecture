import { Component, OnInit, Input,Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  titleName="도서목록 검색";
  @Input() bookList:[];
  @Input() title:string

 

  ngOnInit(): void {
  }

}
