import { Component, OnInit } from '@angular/core';
import {Book} from './book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})

export class BookComponent  {//implements OnInit 삭제 또는 // ngOnInit(): void{} 구현
  titleName="도서목록";
  books:Book[]=[ //interface의 배열 타입선언
    {id:"p01", name:"위험한 식탁", price:2000, date:'20190401', img:'a.jpg'},
    {id:'p02',name:'공부의 비결',price:3000,date:'20170402',img:'b.jpg'},
    {id:'p03',name:'오메르타',   price:2500,date:'20170401',img:'c.jpg'},
    {id:'p04',name:'행복한 여행',price:4000,date:'20170401',img:'d.jpg'},
    {id:'p05',name:'해커스 토익',price:2000,date:'20170401',img:'e.jpg'},
    {id:'p06',name:'도로 안내서',price:2000,date:'20170401',img:'f.jpg'},
  ];
  getTileName(){
    return this.titleName;
  };
 // ngOnInit(): void{}
}
