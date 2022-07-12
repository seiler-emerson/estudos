import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//Components
import { BackgroundComponent } from './components/background/background.component';
import { DisplayComponent } from './components/display/display.component';
import { ButtonsComponent } from './components/buttons/buttons.component';

//Page
import { HomeComponent } from './pages/home/home.component';



@NgModule({
  declarations: [
    BackgroundComponent,
    DisplayComponent,
    ButtonsComponent,
    HomeComponent
  ],
  imports: [
    CommonModule
  ]
})
export class HomeModule { }
