import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppointmentComponent } from './appointment/appointment.component';
import { DoctorComponent } from './doctor/doctor.component';
import { LoggedAreaComponent } from './logged-area/logged-area.component';
import { NewAppointmentComponent } from './new-appointment/new-appointment.component';
import { NewDoctorComponent } from './new-doctor/new-doctor.component';
import { NewPatientComponent } from './new-patient/new-patient.component';
import { NewUserComponent } from './new-user/new-user.component';
import { PatientComponent } from './patient/patient.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  { path: "appointment", component: AppointmentComponent},
  { path: "new-appointment", component: NewAppointmentComponent},
  { path: "patient", component: PatientComponent},
  { path: "new-patient", component: NewPatientComponent},
  { path: "doctor", component: DoctorComponent},
  { path: "new-doctor", component: NewDoctorComponent},
  { path: "user", component: UserComponent},
  { path: "new-user", component: NewUserComponent},
  { path: "logged-area", component: LoggedAreaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
