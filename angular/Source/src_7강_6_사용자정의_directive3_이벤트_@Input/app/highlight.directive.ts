import { Directive,ElementRef, Renderer2,Input, HostListener, } from '@angular/core';
//HostListener추가 ,Input추가
@Directive({
  selector: '[appHighlight]'//html에서 사용할 selector
})
export class HighlightDirective {
  title="사용자 정의 directive에서 input사용";
  @Input('appHighlight') colorName:string;
  @HostListener('click') onmouseClick(){
    this.render.setStyle(this.eleRef.nativeElement, "color", this.colorName);
  }
  constructor(public eleRef:ElementRef, public render:Renderer2) {
  
   }  
  
   
}
