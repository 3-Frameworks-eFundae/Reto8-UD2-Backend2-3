import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Home } from '../model/Home';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  readonly API_URL = 'http://localhost:9000';
  bienvenida: Home | undefined;

  constructor(private http: HttpClient) {
  }

  getMensaje() {
    return this.http.get<Home>(this.API_URL);
  }
}
