import { Directive,ElementRef, Renderer2,HostListener } from '@angular/core';
//HostListener추가
@Directive({
  selector: '[appHighlight]'//html에서 사용할 selector
})
export class HighlightDirective {

  constructor(public eleRef:ElementRef, public render:Renderer2) {
  
   }  
   //이벤트처리
   @HostListener('mouseover') onMouseOver(){
      this.render.setStyle(this.eleRef.nativeElement,"color", "red");
      this.render.setStyle(this.eleRef.nativeElement,"font-size", "20px");
   }
   @HostListener('mouseleave') onMouseLeave(){
    this.render.removeStyle(this.eleRef.nativeElement,"color"); //스타일 삭제
    this.render.removeStyle(this.eleRef.nativeElement,"font-size");
   }
}
