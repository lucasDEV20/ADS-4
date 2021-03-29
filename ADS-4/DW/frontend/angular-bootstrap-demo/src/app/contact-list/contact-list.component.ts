import { Component, OnInit } from '@angular/core';
import { ok } from 'assert';
import { DataService } from '../data.service';

@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.css'],
})
export class ContactListComponent implements OnInit {
  contacts;
  selectedContact;
  edicao = false;
//construtor 
  constructor(public dataService: DataService) {}

  // Diferente do método construtor, o ngOnInit método vem de uma interface Angular ( OnInit)
  // que o componente precisa implementar para usar esse método. O ngOnInitmétodo é chamado logo após a criação do componente.
  ngOnInit() {
    this.listar();
  }

  // metodo que lista os contatos criados 
  // tslint:disable-next-line:typedef
  public listar() {
    this.dataService.getContacts().subscribe((resposta) => {
      this.contacts = resposta;
    });
  }


  //metdod que  pee
  // tslint:disable-next-line:typedef
  public selectContact(contact) {
    this.selectedContact = contact;
  }

  // tslint:disable-next-line:typedef
  public deleteContact(contact) {
    this.dataService.deleteContacts(contact.id).subscribe((r) => {
      this.clickMethod();

      this.listar();
    });
  }

  // tslint:disable-next-line:typedef
  public editar() {
    this.edicao = true;
  }

  // tslint:disable-next-line:typedef
  public cancelar() {
    this.edicao = false;
  }

  // tslint:disable-next-line:typedef
  public salvar() {
    this.dataService.saveContact(this.selectedContact).subscribe((r) => {
      this.edicao = false;
      this.listar();
    });
  }
  // https://www.ti-enxame.com/pt/angular/angular-2-maneira-facil-de-criar-um-dialogo-de-confirmacao/830455194/
  //link de fonte
  public clickMethod() {
    
        if (confirm('Voce tem que certeza qeu deseja esxcluir este contato ? ')) {
          if(confirm == ok){
            this.salvar
          }
       
        }
     
    }
  }

