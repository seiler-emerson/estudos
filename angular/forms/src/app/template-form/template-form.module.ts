import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TemplateFormComponent } from './template-form.component';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { DataFormComponent } from '../data-form/data-form.component';
import { FormDebugComponent } from '../form-debug/form-debug.component';

@NgModule({
  declarations: [
    TemplateFormComponent,
    DataFormComponent,
    FormDebugComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
  ]
})
export class TemplateFormModule { }
