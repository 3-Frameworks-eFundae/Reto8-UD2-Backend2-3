import { Component, OnInit } from '@angular/core';
import { HomeService } from '../../services/home.service';
import { RouterModule } from '@angular/router';
import { Home } from '../../model/Home';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  title: string = 'Página de inicio';
  bienvenida: string;

  constructor(public homeService: HomeService) {
    this.bienvenida = '';
  }

  ngOnInit(): void {
    this.homeService.getMensaje().subscribe({
      next: (data) => {
        this.bienvenida = data.mensaje;
      },
      error: (error) => {
        console.error('Error al obtener el mensaje:', error);
      },
      complete: () => {
        console.log('Petición completada');
      }
    });
  };

}
