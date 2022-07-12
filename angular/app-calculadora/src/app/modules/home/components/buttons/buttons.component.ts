import { Component, DoCheck, EventEmitter, OnInit, Output } from '@angular/core';

//Services
import { CalcExpressionService } from 'src/app/services/calc-expression.service';

@Component({
  selector: 'app-buttons',
  templateUrl: './buttons.component.html',
  styleUrls: ['./buttons.component.css']
})
export class ButtonsComponent implements OnInit, DoCheck {

  public calc: string = "";
  public result: string = "";

  constructor(private calcExpressionService: CalcExpressionService) { }

  ngOnInit(): void {
  }

  ngDoCheck(): void {
  }

  public insert(char: string) {
    this.calc = this.calc+char;
  }
  
  public addCalcExpression() {
    return this.calcExpressionService.calcExpressionAdd(this.calc);
  }

  public calculate() {
    if(!Number.isInteger(eval(this.calc))) {
      this.result = eval(this.calc).toFixed(3).toString();
    } else {
      this.result = eval(this.calc).toString();
    }
    this.setResult();
  }
  public setResult() {
    return this.calcExpressionService.calculateAdd(this.result);
  }

  public eraseAll() {
    this.calc = "";
    this.result = "";
    this.addCalcExpression();
    this.setResult();
  }

  public eraseLast() {
    let expression = this.calc.substring(0, this.calc.length -1);
    this.calc=expression;
    this.addCalcExpression()
  }
 
}
