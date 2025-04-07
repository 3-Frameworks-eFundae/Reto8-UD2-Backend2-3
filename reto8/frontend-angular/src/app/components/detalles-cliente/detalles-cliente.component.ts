import { Component, OnInit } from '@angular/core';
import { ClienteService } from '../../services/cliente.service';
import { Cliente } from '../../model/Cliente';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-detalles-cliente',
  imports: [],
  templateUrl: './detalles-cliente.component.html',
  styleUrl: './detalles-cliente.component.css'
})
export class DetallesClienteComponent implements OnInit {

  cliente: Cliente | undefined;
  id: number;

  constructor(public clienteService: ClienteService, private route: ActivatedRoute) {
    this.id = parseInt(this.route.snapshot.paramMap.get("id")!);
  }

  ngOnInit(): void {
    this.clienteService.getClientePorId(this.id).subscribe({
      next: (data) => {
        this.cliente = data[0];
        console.log('Cliente recibido:', data);
      }, 
      error: (error) => {
        console.error('Error al obtener el cliente:', error);
      }, 
      complete: () => {
        console.log('Petición completada');
      }
    });
  }

}
