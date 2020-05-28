import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Patient } from './patient';

@Injectable({
  providedIn: 'root'
})
export class PatientServiceService {

  constructor(private httpClient : HttpClient) { }
  public url : string = "http://localhost:8080/api/v1/patients";

  getPatientDetails(): Observable<Patient[]>{
    return this.httpClient.get<Responses>(this.url).pipe(map( response => response._embedded.CodeBoardPatients));
  }
}


interface Responses{
  _embedded : {
    CodeBoardPatients : Patient[]
  }
}