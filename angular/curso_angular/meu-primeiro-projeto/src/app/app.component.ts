import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <app-diretivas-atributos></app-diretivas-atributos>
    <!-- <app-diretivas-estruturais></app-diretivas-estruturais> -->
    <app-data-biding></app-data-biding>
    <router-outlet></router-outlet>`
})
export class AppComponent implements OnInit {
  
  constructor() { }

  ngOnInit(): void { }

}
