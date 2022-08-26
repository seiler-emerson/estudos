import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent implements OnInit {

  patients: Array<any> = [
    {
        name: "Sheldon Cooper",
        cpf: "036.869.260-40",
        motherName: "Mary Cooper",
        fatherName: "George Cooper",
        genre: "Male",
        birthDate: "1980-02-26",
        streetName: "Av Los Robles Avenue",
        numberHome: 2311,
        district: "Central",
        city: "Pasadena",
        state: "California",
        country: "EUA",
        appointments: [
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[1].name,
                anamnesis: "Dor abdominal",
                prescription: "laxante - 8/8h - 1 dia",
                certificate: "Atestado",
                forwarding: "encaminhamento para gastro",
                medicalRealise: "Liberado"
            },
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[2].name,
                anamnesis: "Dor abdominal",
                prescription: "laxante - 8/8h - 1 dia",
                certificate: "Atestado",
                forwarding: "encaminhamento para gastro",
                medicalRealise: "Liberado"
            },
        ]
    },
    {
        name: "Joana da Silva",
        cpf: "502.680.680-54",
        motherName: "Julia Garcia",
        fatherName: "Joao da Silca",
        genre: "Female",
        birthDate: "1991-01-01",
        streetName: "Rua 456",
        numberHome: 28,
        district: "Decimal",
        city: "Numerais",
        state: "Sao Paulo",
        country: "Brasil",
        appointments: [
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[1].name,
                anamnesis: "Dor abdominal",
                prescription: "laxante - 8/8h - 1 dia",
                certificate: "Atestado",
                forwarding: "encaminhamento para gastro",
                medicalRealise: "Liberado"
            },
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[1].name,
                anamnesis: "Dor abdominal",
                prescription: "laxante - 8/8h - 1 dia",
                certificate: "Atestado",
                forwarding: "encaminhamento para gastro",
                medicalRealise: "Liberado"
            },
        ]
    },
    {
        name: "Cleber Silveira",
        cpf: "163.514.890-16",
        motherName: "Carla Silva Garcia",
        fatherName: "Olindio Silveira",
        genre: "Male",
        birthDate: "1995-04-13",
        streetName: "Rua 456",
        numberHome: 218,
        district: "Decimal",
        city: "Numerais",
        state: "Sao Paulo",
        country: "Brasil",
        appointments: [
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[1].name,
                anamnesis: "Dor abdominal",
                prescription: "laxante - 8/8h - 1 dia",
                certificate: "Atestado",
                forwarding: "encaminhamento para gastro",
                medicalRealise: "Liberado"
            },
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[2].name,
                anamnesis: "Dor de cabeca",
                prescription: "paracetamol - 8/8h - se dor",
                certificate: "Declaracao de comparecimento",
                forwarding: "encaminhamento para neuro",
                medicalRealise: "Liberado"
            },
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[0].name,
                anamnesis: "Dor abdominal",
                prescription: "laxante - 8/8h - 1 dia",
                certificate: "Atestado",
                forwarding: "encaminhamento para gastro",
                medicalRealise: "Liberado"
            },
        ]
    },
    {
        name: "Silvana Github",
        cpf: "763.323.270-65",
        motherName: "Olivia Github",
        fatherName: "Linus Github",
        genre: "Male",
        birthDate: "2006-10-06",
        streetName: "Rua Versionamento",
        numberHome: 21,
        district: "Git",
        city: "Online",
        state: "Santa Catarina",
        country: "Brasil",
        appointments: [
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[2].name,
                anamnesis: "Dor de cabeca",
                prescription: "paracetamol - 8/8h - se dor",
                certificate: "Declaracao de comparecimento",
                forwarding: "encaminhamento para neuro",
                medicalRealise: "Liberado"
            },
            {
                date: "2022-01-02",
                hour: "01:15:00",
                //doctor: doctor[0].name,
                anamnesis: "Dor abdominal",
                prescription: "laxante - 8/8h - 1 dia",
                certificate: "Atestado",
                forwarding: "encaminhamento para gastro",
                medicalRealise: "Liberado"
            },
        ]
    },
]

  constructor() { }

  ngOnInit(): void {
  }

  deletePatient(index: number) {
    this.patients.splice(index,1)
  }

}
