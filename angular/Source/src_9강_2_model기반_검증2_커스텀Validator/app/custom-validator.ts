import {FormControl} from '@angular/forms';
//FormControl 
export class CustomValidator {
    //ng g class CustomValidator
    static eq5(control:FormControl){
        var result=null;
        if(control.value!=5){//5와 다르면
            result={eq5:true}//유효성 검증에 문제 있음 함수 이름 사용
        }
        return result; //null이면 문제없음을 의미
    }
}
