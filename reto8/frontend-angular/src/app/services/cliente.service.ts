import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cliente } from '../model/Cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private readonly API_URL_CLIENTES = 'http://localhost:9000/clientes';

  constructor(private http: HttpClient) { }

  getClientes() {
    return this.http.get<Cliente[]>(this.API_URL_CLIENTES);
  }
  
  getClientePorId(id: number) {
    return this.http.get<Cliente[]>(`${this.API_URL_CLIENTES}/${id}`);
  }
}
