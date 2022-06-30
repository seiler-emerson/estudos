import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-output',
  templateUrl: './output.component.html',
  styleUrls: ['./output.component.scss']
})
export class OutputComponent implements OnInit {

  @Output() public enviarDados = new EventEmitter();

  public list: Array<{nome: string, idade: number}> = [
    {nome: "Emerson Seiler", idade: 27 },
    {nome: "Mayara Cunha Machado", idade: 35 },
    {nome: "Evina Seiler", idade: 25 }
  ]
  
  constructor() { }

  ngOnInit(): void {
  }

  public getDados(event: number) {
    this.enviarDados.emit(this.list[event]);
  }

}
