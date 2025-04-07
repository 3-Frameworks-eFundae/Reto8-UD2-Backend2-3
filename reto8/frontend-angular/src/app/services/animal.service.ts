import { Injectable } from '@angular/core';
import { Animal } from '../model/Animal';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  private readonly API_URL_ANIMALES = 'http://localhost:9000/animales';

  constructor(private http: HttpClient) { }

  getAnimales() {
    return this.http.get<Animal[]>(this.API_URL_ANIMALES);
  }

  getAnimalPorClienteID(id: number) {
    return this.http.get<Animal[]>(`${this.API_URL_ANIMALES}/${id}`);
  }
}
