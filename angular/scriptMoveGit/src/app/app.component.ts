import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <app-input></app-input>
  <app-code-area></app-code-area>
  <router-outlet></router-outlet>
  `
})
export class AppComponent {
  title = 'scriptMoveGit';
}
