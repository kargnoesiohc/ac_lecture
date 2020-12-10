import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MorningComponent } from './morning.component';




@NgModule({
  declarations: [MorningComponent],
  exports:[MorningComponent],//morning export
  imports: [
    CommonModule
  ]
})
export class MorningModule { }
