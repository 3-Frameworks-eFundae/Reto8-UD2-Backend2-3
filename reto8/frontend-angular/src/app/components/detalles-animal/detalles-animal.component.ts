import { Component, OnInit } from '@angular/core';
import { AnimalService } from '../../services/animal.service';
import { ActivatedRoute } from '@angular/router';
import { Animal } from '../../model/Animal';
import { FormatDate } from '../utils/FormatDate';

@Component({
  selector: 'app-detalles-animal',
  imports: [],
  templateUrl: './detalles-animal.component.html',
  styleUrl: './detalles-animal.component.css'
})
export class DetallesAnimalComponent implements OnInit {

  animal: Animal | undefined;
  id: number;

  constructor(public animalesService: AnimalService, private route: ActivatedRoute) {
    this.id = parseInt(this.route.snapshot.paramMap.get('id')!);
  }

  formatearFecha(fecha: string): string {
    return FormatDate.formatDate(fecha);
  }

  ngOnInit(): void {
    this.animalesService.getAnimalPorClienteID(this.id).subscribe({
      next: (data) => {
        this.animal = data[0];
        console.log('Animal obtenido:', this.animal);
      },
      error: (error) => {
        console.error('Error al obtener el animal:', error);
      },
      complete: () => {
        console.log('Petición completada');
      }
    });
  }

}
