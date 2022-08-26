import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit {

  doctors = [
    {
        name: "Rafael da Silva",
        cpf: "145.345.345-34",
        motherName: "Julia Silva",
        fatherName: "Carlos da Silva",
        genre: "male",
        birthDate: "1975-04-30",
        streetName: "Rua Barao",
        numberHome: "123",
        district: "Centro",
        city: "São Paulo",
        state: "São Paulo",
        country: "Brasil",
        registerNumber: "123456-9/RR",
        speciality : "Clinico Geral",
        numberAppointments: 23,
    },
    {
        name: "Carlos Francesconi",
        cpf: "343.335.329-81",
        motherName: "Elisandra Francesconi",
        fatherName: "Mateus Francesconi",
        genre: "male",
        birthDate: "1965-03-13",
        streetName: "Rua Irati",
        numberHome: "123",
        district: "Centro",
        city: "Itajaí",
        state: "Santa Catarina",
        country: "Brasil",
        registerNumber: "32455-9/SC",
        speciality : "Cardiologista",
        numberAppointments: 31
    },
    {
        name: "Maria Silva",
        cpf: "745.468.345-84",
        motherName: "Carla Silva",
        fatherName: "Clovis Silva",
        genre: "female",
        birthDate: "1986-09-14",
        streetName: "Rua Conselheiro",
        numberHome: "3476",
        district: "Rocio",
        city: "Itajaí",
        state: "Santa Catarina",
        country: "Brasil",
        registerNumber: "9836745-9/PR",
        speciality : "Obstetra",
        numberAppointments: 19
    }
]

  constructor() { }

  ngOnInit(): void {
  }

  deleteDoctor(index: number) {
    this.doctors.splice(index,1)
  }

}
