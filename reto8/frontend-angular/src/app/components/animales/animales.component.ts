import { Component, OnInit } from '@angular/core';
import { Animal } from '../../model/Animal';
import { AnimalService } from '../../services/animal.service';
import { FormatDate } from '../utils/FormatDate';

@Component({
  selector: 'app-animales',
  imports: [],
  templateUrl: './animales.component.html',
  styleUrl: './animales.component.css'
})
export class AnimalesComponent implements OnInit {

  animales: Animal[];

  constructor(public animalesService: AnimalService) {
    this.animales = [];
  }

  formatearFecha(fecha: string): string {
    return FormatDate.formatDate(fecha);
  }

  ngOnInit(): void {
    this.animalesService.getAnimales().subscribe({
      next: (data) => {
        this.animales = data;
      },
      error: (error) => {
        console.error('Error al obtener los animales:', error);
      },
      complete: () => {
        console.log('Petición completada');
      }
    });
  }
}
