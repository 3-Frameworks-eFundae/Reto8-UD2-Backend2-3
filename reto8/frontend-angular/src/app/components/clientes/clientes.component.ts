import { Component, OnInit } from '@angular/core';
import { ClienteService } from '../../services/cliente.service';
import { Cliente } from '../../model/Cliente';

@Component({
  selector: 'app-clientes',
  imports: [],
  templateUrl: './clientes.component.html',
  styleUrl: './clientes.component.css'
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[];
  constructor(public clientesService: ClienteService) { 
    this.clientes = [];
  }

  ngOnInit(): void {
    this.clientesService.getClientes().subscribe({
      next: (data) => {
        this.clientes = data;
      },
      error: (error) => {
        console.error('Error al obtener los clientes:', error);
      },
      complete: () => {
        console.log('Petición completada');
      }
    });
  }

}
