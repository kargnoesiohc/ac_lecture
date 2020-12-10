import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'my' //식별자 이름
})
export class MyPipe implements PipeTransform {

  transform(value: string, ...args: string[]): string {
    if(value.length==8 && args != undefined){
      return value.substring(0,4)+args+ value.substring(4,6)+args
      +value.substring(6,8);
    }
   
  }

}
