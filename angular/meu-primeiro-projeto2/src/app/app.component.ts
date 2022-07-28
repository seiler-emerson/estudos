import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <app-title *ngIf="destruir"></app-title>
  <br/>
  <button (click)="destruirComponent()">Destruir Componente</button>
  <router-outlet></router-outlet>`
  // {{valor}}
  // <button (click)="adicionar()">Adicionar</button>
})
export class AppComponent implements OnInit, DoCheck, AfterContentChecked, AfterContentInit, AfterViewInit, AfterViewChecked{

  public valor: number = 1;

  public destruir:boolean = true;

  constructor() {}

  public adicionar(): number {
    return this.valor +=1;
  };

  ngOnInit(): void {  }

  ngDoCheck(): void {
    console.log("ngDoCheck");
  }
  ngAfterContentInit(): void { 
    console.log("ngAfterContentInit");
  }
  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked");
  }
  ngAfterViewInit(): void {
    console.log("ngAfterViewInit");
  }
  ngAfterViewChecked(): void {
    console.log("ngAfterViewChecked");
  }

  public destruirComponent() {
    this.destruir = false;
  }
}
