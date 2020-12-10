import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustService {

  constructor() { }
  //CustSerivce의 역할은 현재 날짜 정보 반환
  currentDate():Date{
    return new Date();
  }
}
