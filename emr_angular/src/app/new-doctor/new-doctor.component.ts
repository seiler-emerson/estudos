import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-doctor',
  templateUrl: './new-doctor.component.html',
  styleUrls: ['./new-doctor.component.css']
})
export class NewDoctorComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  newDoctor() {
    (<HTMLInputElement>document.getElementById('formNewDoctor')).addEventListener('submit', (event) => {
      event.preventDefault()
      let data = this.getData()
      //console.log("Recebi", data)

      let newDoctorButton =  (<HTMLInputElement>document.querySelector('#newDoctor'))

      if(newDoctorButton.offsetParent !== null) {
        console.log("Salvando",data)
      } else {
        // patient[patient.indexOf(update)] = data
        // console.log(data);
      }

    });
  }

  getData() {
    let name: string = (<HTMLInputElement>document.getElementById("doctorName")).value
    let cpf: string = (<HTMLInputElement>document.getElementById("doctorCPF")).value
    let motherName: string = (<HTMLInputElement>document.getElementById("doctorMotherName")).value
    let fatherName: string = (<HTMLInputElement>document.getElementById("doctorFatherName")).value
    let genre: string = (<HTMLInputElement>document.querySelector('input[name="genreDoctor"]:checked')).value
    let birthDate: string = (<HTMLInputElement>document.getElementById("doctorBirthDate")).value
    let streetName: string = (<HTMLInputElement>document.getElementById("doctorStreet")).value
    let numberHome: string = (<HTMLInputElement>document.getElementById("doctorHomeNumber")).value
    let district: string = (<HTMLInputElement>document.getElementById("doctorDistrict")).value
    let city: string = (<HTMLInputElement>document.getElementById("doctorCity")).value
    let state: string = (<HTMLInputElement>document.getElementById("doctorState")).value
    let country: string = (<HTMLInputElement>document.getElementById("doctorCountry")).value
    let registerNumber: string = (<HTMLInputElement>document.getElementById("doctorRegisterNumber")).value
    let specialty: string = (<HTMLInputElement>document.getElementById("doctorSpecialty")).value
    let numberAppointments: Array<any> = []
    
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
      registerNumber: registerNumber,
      specialty: specialty,
      numberAppointments: numberAppointments
    }
  }
}
