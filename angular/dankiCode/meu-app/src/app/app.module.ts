import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SchoolComponent } from './school/school.component';
import { SchoolsComponent } from './schools/schools.component';

@NgModule({
  declarations: [
    AppComponent,
    SchoolComponent,
    SchoolsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
