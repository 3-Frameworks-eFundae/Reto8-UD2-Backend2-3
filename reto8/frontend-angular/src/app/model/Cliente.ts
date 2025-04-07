export class Cliente {
    id: String
    idCliente: number;
    nombre: string;
    direccion: string;
    numeroTelefono: number;

    constructor(id: string, idCliente: number, nombre: string, direccion: string, numeroTelefono: number) {
        this.id = id;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }
}