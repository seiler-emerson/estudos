import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-schools',
  templateUrl: './schools.component.html',
  styleUrls: ['./schools.component.css']
})
export class SchoolsComponent implements OnInit {

  allowNewSchool: boolean = false;
  createdSchoolStatus: string = 'Nenhuma escola criada';
  schoolName: string = "Nome de Teste da Escola";


  constructor() { }

  ngOnInit(): void {
    setTimeout(()=>{
      this.allowNewSchool = true;
    },3000);
  }

  createSchool() {
    this.createdSchoolStatus = "Escola foi criada com o nome de "+ this.schoolName;
  }

  updateSchoolName(event: Event) {
    this.schoolName = (<HTMLInputElement>event.target).value;
  }
}
