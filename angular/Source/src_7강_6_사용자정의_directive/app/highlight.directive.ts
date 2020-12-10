import { Directive,ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]'//html에서 사용할 selector
})
export class HighlightDirective {

  constructor(public eleRef:ElementRef, public render:Renderer2) {
    render.setStyle(eleRef.nativeElement, "color", "red");
    render.setStyle(eleRef.nativeElement, "font-size", "50px");
   }

}
