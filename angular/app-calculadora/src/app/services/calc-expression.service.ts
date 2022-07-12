import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalcExpressionService {

  private calc: string = "";
  public result: string = "";

  constructor() { }

  public calcExpression() {
    return this.calc;
  }

  public calculateView() {
    return this.result;
  }

  public calcExpressionAdd(value: string) {
    this.calc = value;
  }

  public calculateAdd(value: string) {
    this.result = value;
  }
}
