import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
/////////////////////////////////
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
/////////////////////////////////
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,    //등록
    HttpClientModule   //등록
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
