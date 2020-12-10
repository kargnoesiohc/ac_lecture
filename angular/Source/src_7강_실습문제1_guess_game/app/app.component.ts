import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '추억의 guess게임';
  guess=0;
  original;   //정답숫자
  deviation; //예측값
  noOfTries;  //시도횟수
  constructor(){
    this.original=Math.floor(Math.random()*10+1);
    console.log("정답값===", this.original);
    this.deviation=0;
    this.noOfTries=0;
  }
  ok(guess){
    this.guess= guess;
    this.deviation= this.original-this.guess;
    this.noOfTries= this.noOfTries+1;
  }
  restart(){
    this.guess=0;
    this.original=Math.floor(Math.random()*10+1);
    this.deviation=0;
    this.noOfTries=0;
    console.log("실제값",this.original);

  }
}
