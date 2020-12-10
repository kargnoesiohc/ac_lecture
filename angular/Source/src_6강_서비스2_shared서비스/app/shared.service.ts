import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SharedService {

  //공유 데이터
  names:string[]=[];//부모 자식 간의 공유 데이터 
  addName(n:string){
    this.names.push(n);
  }
  constructor() { }
}
