import { Component } from '@angular/core';
import {BookserviceService} from './book/bookservice.service';
import {Book} from './book/book';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[BookserviceService]
})
export class AppComponent {
  title = '도서목록';
  books:Book[];
  constructor(public service:BookserviceService){
    this.books= service.bookList();
  }
  
 
}
