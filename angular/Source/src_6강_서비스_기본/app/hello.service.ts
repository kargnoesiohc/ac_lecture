import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  constructor() { }
  //공통서비스(로직) 구현
  sayHello():string{
    return "Hello 서비스";
  }
}
