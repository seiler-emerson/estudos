import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-patient',
  templateUrl: './new-patient.component.html',
  styleUrls: ['./new-patient.component.css']
})
export class NewPatientComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  newPatient() {
    (<HTMLInputElement>document.getElementById('formNewPatient')).addEventListener('submit', (event) => {
      event.preventDefault()
      let data = this.getData()
      //console.log("Recebi", data)

      let newPatientButton =  (<HTMLInputElement>document.querySelector('#newPatient'))

      if(newPatientButton.offsetParent !== null) {
        console.log("Salvando",data)
      } else {
        // patient[patient.indexOf(update)] = data
        // console.log(data);
      }

    });
  }


  getData() {
    let name: string = (<HTMLInputElement>document.getElementById("patientName")).value
    let cpf: string = (<HTMLInputElement>document.getElementById("patientCPF")).value
    let motherName: string = (<HTMLInputElement>document.getElementById("patientMotherName")).value
    let fatherName: string = (<HTMLInputElement>document.getElementById("patientFatherName")).value
    let genre: string = (<HTMLInputElement>document.querySelector('input[name="genre"]:checked')).value
    let birthDate: string = (<HTMLInputElement>document.getElementById("birthDate")).value
    let streetName: string = (<HTMLInputElement>document.getElementById("patientStreet")).value
    let numberHome: string = (<HTMLInputElement>document.getElementById("patientHomeNumber")).value
    let district: string = (<HTMLInputElement>document.getElementById("patientDistrict")).value
    let city: string = (<HTMLInputElement>document.getElementById("patientCity")).value
    let state: string = (<HTMLInputElement>document.getElementById("patientState")).value
    let country: string = (<HTMLInputElement>document.getElementById("patientCountry")).value
    let appointments: Array<any> = []

    return {
      name: name,
      cpf: cpf,
      motherName: motherName,
      fatherName: fatherName,
      genre: genre,
      birthDate: birthDate,
      streetName: streetName,
      numberHome: numberHome,
      district: district,
      city: city,
      state: state,
      country: country,
      appointments: []
    }
  }
}


