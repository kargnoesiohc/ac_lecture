import { Component, OnInit } from '@angular/core';
import {Book} from './book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})

export class BookComponent  {//implements OnInit 삭제 또는 // ngOnInit(): void{} 구현
  titleName="도서목록";
  booksResult=[];//생성자에서 book을 담아 보여줌
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
  constructor(){
    for(var book of this.books){
      this.booksResult.push(book); //배열에 저장
    }
  }

  searchName(event){//검색어 입력시 
    var searchName= event.target.value;
    this.booksResult=[]; //초기화 후 검색결과 저장
    if(searchName==''){
      for(var book of this.books){
        this.booksResult.push(book);
      }
    }else{
      for(var book of this.books){
        console.log("실행됨 검색어", searchName)
        if(book.name.indexOf(searchName) != -1){  //검색어가 있다면
          this.booksResult.push(book);
        }
      }
    }
    console.log(this.booksResult);
  }//end Serch
 // ngOnInit(): void{}
 //////////////////////////////////////////
 item={}
 imgClick(id){
   for(var book of this.books){
     if(book.id==id){
       this.item=book; //하나의 항목만 저장
     }
   }
 }
}
