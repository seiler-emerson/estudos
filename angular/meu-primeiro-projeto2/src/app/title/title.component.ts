import { Component, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.scss']
})
export class TitleComponent implements OnInit, OnChanges, OnDestroy {

  @Input() public title: string = "Hello Word";
    
  constructor() { }
  ngOnDestroy(): void {
    console.log("Componente destruido.");
  }

  ngOnInit(): void {
  }

  ngOnChanges(): void {
    // alert("Foi alterado com sucesso!");
  }

}
