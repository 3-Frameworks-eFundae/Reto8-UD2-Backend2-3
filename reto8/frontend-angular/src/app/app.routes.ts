import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'clientes', loadComponent: () => import('./components/clientes/clientes.component').then(m => m.ClientesComponent) },
    { path: 'animales', loadComponent: () => import('./components/animales/animales.component').then(m => m.AnimalesComponent) },
    { 
        path: 'clientes/:id', 
        loadComponent: () => import('./components/detalles-cliente/detalles-cliente.component').then(m => m.DetallesClienteComponent) 
    },
    {
        path: 'animales/:id',
        loadComponent: () => import('./components/detalles-animal/detalles-animal.component').then(m => m.DetallesAnimalComponent)
    }
];
