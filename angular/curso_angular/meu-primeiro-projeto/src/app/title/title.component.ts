import { Component, Input, OnChanges, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.scss']
})
export class TitleComponent implements OnInit, OnChanges, OnDestroy {

  @Input() public title:string = "Olá mundo";
  
  constructor() { }

  ngOnInit(): void {
  }

  ngOnChanges(): void {
    //alert("Foi alterado com sucesso!");
  }

  ngOnDestroy(): void {
    console.log("Ele foi destruido!");
  }
}
