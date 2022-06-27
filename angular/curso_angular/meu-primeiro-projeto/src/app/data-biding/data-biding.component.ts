import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-biding',
  templateUrl: './data-biding.component.html',
  styleUrls: ['./data-biding.component.scss']
})
export class DataBidingComponent implements OnInit {

  public nome: string = "Emerson";
  public idade: number = 27;
  public maisUm: number = 1;

  public checkedDisable: boolean = false;
  public imgSrc: string = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/2048px-Angular_full_color_logo.svg.png";
  public imgTitle: string = "Property Binding";
  
  public position: {x: number, y:number} = { x: 0, y:0 };

  constructor() { }

  ngOnInit(): void { }

  public alertaInfo(valor: MouseEvent) {
    console.log(valor)
  }

  public mouseMoveTest(valor: MouseEvent) {
    //console.log(valor);
    this.position.x = valor.offsetX;
    this.position.y = valor.offsetY;
  }
}
