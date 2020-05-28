import { Component, OnInit } from '@angular/core';
import { PatientServiceService } from '../patient-service.service';
import { Patient } from '../patient';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private patientService : PatientServiceService) { }
  public patients :Patient[];

  ngOnInit(): void {
    this.getDetails()
  }

  getDetails(){
    this.patientService.getPatientDetails().subscribe(data => this.patients= data);
  }

}
