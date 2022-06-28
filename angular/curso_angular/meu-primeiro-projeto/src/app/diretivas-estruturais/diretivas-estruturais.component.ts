import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-diretivas-estruturais',
  templateUrl: './diretivas-estruturais.component.html',
  styleUrls: ['./diretivas-estruturais.component.scss']
})
export class DiretivasEstruturaisComponent implements OnInit {

  public condition: boolean = true;
  public conditionClick: boolean = true;

  public list: Array<{ nome: string, idade: number}> = [
    { nome: "Emerson Seiler", idade: 27},
    { nome: "Mayara Cunha Machado", idade: 34},
    { nome: "Alecxeyevina Mayra Seiler", idade: 25}
  ];

  public nome: string = 'Emerson';

  constructor() { }

  ngOnInit(): void {

    setInterval(()=>{
      if(this.conditionClick) {
        this.conditionClick = false;
      } else {
        this.conditionClick = true;
      }
    },2000)
  }

  public onClick(){
    if(this.conditionClick) {
      this.conditionClick = false;
    } else {
      this.conditionClick = true;
    }
  }

  public onClickAddList() {
    this.list.push({nome: "Sheldon", idade: 6});
  }

  public onClickEventList(event: number) {
    this.list.splice(event, 1);
  }
}
