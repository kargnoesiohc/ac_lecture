import { Component, OnInit } from '@angular/core';
import {CustService} from './cust.service'

@Component({
  selector: 'app-cust',
  templateUrl: './cust.component.html',
  styleUrls: ['./cust.component.css'],
  providers:[CustService]//서비스 등록 
})
export class CustComponent implements OnInit {
  //생성자를 통해 자동주입
  constructor(public custService:CustService) { }
  getCurrentDate():Date{
    return this.custService.currentDate();//공통로직 호출
  }
  ngOnInit(): void {
  }

}
