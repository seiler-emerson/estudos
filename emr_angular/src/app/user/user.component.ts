import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: Array<any> = [
    {
      login: "admin",
      password: "admin"
    },
    {
      login: "doctor",
      password: "doctor"
    },
    {
      login: "user",
      password: "user"
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

  deleteUser(index: number) {
    this.users.splice(index,1)
  }
}
