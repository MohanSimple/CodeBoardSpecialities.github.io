import { Component } from '@angular/core';
import { Patient } from './patient';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 patients: Patient[] =[

  {"id": 12, "name":"Mohan" , "isDeleted":"0"}, 
  {"id": 22, "name":"Bharath" , "isDeleted":"0"}, 
  {"id": 24, "name":"Sumit" , "isDeleted":"0"}, 

 ];


}
