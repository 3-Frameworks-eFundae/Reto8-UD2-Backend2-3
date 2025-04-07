import { Cliente } from "./Cliente";

export class Animal {
    id: String;
    idAnimal: number;
    nombre: string;
    raza: string;
    especie: string;
    fechaNacimiento: Date;
    dueno: Cliente;

    constructor(
        id: String,
        id_animal: number,
        nombre: string,
        raza: string,
        especie: string,
        fechaNacimiento: Date,
        dueno: Cliente
    ) {
        this.id = id;
        this.idAnimal = id_animal;
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.dueno = dueno;
    }
}