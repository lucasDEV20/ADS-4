import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-contact-create',
  templateUrl: './contact-create.component.html',
  styleUrls: ['./contact-create.component.css']
})
export class ContactCreateComponent implements OnInit {

  contact : {id, name, description, email} = {id: null, name: "", description: "", email: ""};

  constructor(public dataService: DataService) { }

  

  ngOnInit() {
  }

  createContact(){
    console.log(this.contact);
    this.dataService.saveContact(this.contact).subscribe(r => {
      this.contact = {id: null, name: "", description: "", email: ""};
    });
  }  

}




