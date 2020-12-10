import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomValidator} from '../custom-validator';

@Component({
  selector: 'app-dog',
  templateUrl: './dog.component.html',
  styleUrls: ['./dog.component.css']
})
export class DogComponent implements OnInit {
//// app.module에  FormsModule, ReactiveFormsModule 등록 필요
///////////////////////
form= new FormGroup({
  eq5:new FormControl("", CustomValidator.eq5 ),//사용자 정의 
  requried_1:new FormControl("", [Validators.required, Validators.pattern("[0-9]{2}")]),  
  upperCase_2:new FormControl("", Validators.compose([Validators.required, Validators.pattern("[A-Z]{3}")]))
});
////////////////////////////////////////////////////
dog={
  name:'',
  age:'',
  species:'진도개'
}
onSubmit(){
  console.log(this.form);
  console.log(this.form.controls.upperCase_2.value);
  console.log(this.form.controls.requried_1.value);
  console.log(this.form.valid);
  console.log(this.form.controls);
  this.dog.name=this.form.controls.upperCase_2.value;
  this.dog.age=this.form.controls.requried_1.value;
  console.log(this.dog);
}
  constructor() { }

  ngOnInit(): void {
  }

}
