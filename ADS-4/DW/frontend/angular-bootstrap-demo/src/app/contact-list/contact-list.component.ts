import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.css']
})
export class ContactListComponent implements OnInit {

  contacts;
  selectedContact;

  constructor(public dataService: DataService) { }

  ngOnInit() {
    this.dataService.getContacts().subscribe(resposta => {
      this.contacts = resposta;
    });
  }

  public selectContact(contact) {
    this.selectedContact = contact;
  }

}


