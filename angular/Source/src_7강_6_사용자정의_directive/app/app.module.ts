import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { HighlightDirective } from './highlight.directive';//등록

@NgModule({
  declarations: [
    AppComponent,
    HighlightDirective//등록
  ],
  imports: [
    BrowserModule,
    FormsModule//등록
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
