# Identificacion  de clases y objetos
### Package: Modelo.Personas
| Clase candidata | Tipo | Atributos principales | Responsabilidades (metodos) | Justificacon | 
| :---: | :---: | :--- | :--- | :--- |
| **Persona** | `Abstracta` | nombre: String <br/> apellido: String <br/> telefono: int <br/> correo: String | Persona() |  |
| **Dueño** | `Concreta` | direccion: String <br/> mascotas: List<Mascota> | Dueño() |  |
| **Veterinario** | `Concreta` | cedulaProfesional: int <br/> especialidad: String| Veterinario() |  |
| **Recepcionista** | `Concreta` | turno: turno| Recepcionista() |  |

### Package: Modelo.Mascotas
| Clase candidata | Tipo | Atributos principales | Responsabilidades (metodos) | Justificacon | 
| :---: | :---: | :--- | :--- | :--- |
| **Mascota** | `Abstracta` | nombre: String <br/> edad: int <br/> peso: int| Mascota() <br/> emitirSonido(): void |  |
| **Gato** | `Concreta` | esDomestico: boolean| Gato() <br/> emitirSonido(): void |  |
| **Perro** | `Concreta` | raza: String <br/> nivelEnergia: int| Perro() <br/> emitirSonido(): void |  |
| **Perro** | `Concreta` | envergaduraAlas: int| AveExotica() <br/> emitirSonido(): void |  |

### Package: Modelo.Clinica

| Clase candidata | Tipo | Atributos principales | Responsabilidades (métodos) | Justificación |
| :---: | :---: | :--- | :--- | :--- |
| **Modelo.Clinica** | `Concreta` | nombre: String <br/> telefono: int <br/> direccion: String | Modelo.Clinica(nombre: String, telefono: int, direccion: String) | Representa la entidad principal del establecimiento de salud veterinaria. |
| **Consultorio** | `Concreta` | numero: int | Consultorio(numero: int) | Representa un espacio físico o sala específica dentro de la clínica donde se realizan las atenciones. |
| **EstadoCita** | `Enum` | Programada <br/> Atendida <br/> Cancelada | N/A | Enumera los posibles estados en los que se puede encontrar una cita médica dentro del sistema. |

### Package: Modelo.Servicios

| Clase candidata | Tipo | Atributos principales | Responsabilidades (métodos) | Justificación |
| :---: | :---: | :--- | :--- | :--- |
| **ConsultaGeneral** | `Concreta` | tarifaBase: int | ConsultaGeneral(tarifaBase: int) | Representa el servicio médico básico con su costo tarifario principal. |
| **Vacunacion** | `Concreta` | nombreEnfermedad: String <br/> precioVacuna: int <br/> numero: ConsultaGeneral | Vacunacion(nombreEnfermedad: String, precioVacuna: int, numero: ConsultaGeneral) | Representa la aplicación de una vacuna, vinculando la enfermedad a prevenir y la consulta en que se realiza. |
| **Cirugia** | `Concreta` | nombreCirugia: String <br/> numero: ConsultaGeneral <br/> complejidad: Complejidad | Cirugia(nombreCirugia: String, numero: ConsultaGeneral, complejidad: Complejidad) | Representa un procedimiento quirúrgico indicando su tipo, la consulta asociada y el nivel de dificultad. |
| **Cobrable** | `Interface` | N/A | calcularCosto(): int <br/> generarComprobante(): void | Establece el contrato de facturación para aquellos servicios que pueden ser cobrados y comprobados. |
| **Complejidad** | `Enum` | Compleja <br/> Dificil <br/> Intermedia <br/> Facil | N/A | Define los grados de dificultad aplicables a las cirugías. |