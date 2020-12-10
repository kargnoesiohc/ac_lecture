import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { StockComponent } from './stock.component';
import { StockAddComponent } from './stock-add/stock-add.component';



@NgModule({
  declarations: [StockComponent, StockAddComponent],
  exports:[StockComponent],
  imports: [
    CommonModule
  ]
})
export class StockModule { }
