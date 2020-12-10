import { Directive,ElementRef,Renderer2,HostListener } from '@angular/core';

@Directive({
  selector: '[appRedBorder]'//html directive
})
export class RedBorderDirective {

  constructor(public eleRef:ElementRef, public render:Renderer2) { }
  //이벤트처리
  @HostListener("mouseover") onMouseOver(){
    this.render.setStyle(this.eleRef.nativeElement, "border", "1px solid red");
    this.render.setStyle(this.eleRef.nativeElement, "font-size", "20px");
  }

  @HostListener("mouseleave") onMouseLeave(){
    this.render.removeStyle(this.eleRef.nativeElement, "border");
    this.render.removeStyle(this.eleRef.nativeElement, "font-size");
  }
}
