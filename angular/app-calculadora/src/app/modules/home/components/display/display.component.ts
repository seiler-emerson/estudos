import { Component, DoCheck, Input, OnInit } from '@angular/core';

//Service
import { CalcExpressionService } from 'src/app/services/calc-expression.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit, DoCheck {

  public  calc: string = "";
  public result: string = "";

  constructor(private calcExpressionService: CalcExpressionService) { }

  ngOnInit(): void {
    this.calc = this.calcExpressionService.calcExpression();
  }

  ngDoCheck(): void {
    this.calc = this.calcExpressionService.calcExpression();
    this.result = this.calcExpressionService.calculateView()
  }

  
  

}
