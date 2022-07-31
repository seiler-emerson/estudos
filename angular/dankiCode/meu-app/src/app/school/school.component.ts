import { Component } from "@angular/core";

@Component({
    selector: 'app-school',
    templateUrl: './school.component.html',
    styles: [`
        .aberta {
            color: #FFFFFF;
        }
    `]
})

export class SchoolComponent {
    schoolId: number = 10;
    schoolName: string = 'Escola Fundamental Brasil';
    schoolSituation: string = "aberta";

    constructor() {
      this.schoolSituation = Math.random() > 0.5 ? 'aberta': 'fechada';
    }

    getSchoolName(): string {
        return this.schoolName;
    }

    getStatusColor() {
        return this.schoolSituation === 'aberta' ? 'green' : 'red';
      }
}