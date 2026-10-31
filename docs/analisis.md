# Identificacion de clases y objetos
### Package: modelo.personas
| Clase candidata | Tipo | Atributos principales | Responsabilidades (metodos) | Justificacon | 
| :---: | :---: | :--- | :--- | :--- |
| **Persona** | `Abstracta` | nombre: String <br/> apellido: String <br/> telefono: int <br/> correo: String | Persona() |  |
| **Dueño** | `Concreta` | direccion: String <br/> mascotas: List<Mascota> | Dueño() |  |
| **Veterinario** | `Concreta` | cedulaProfesional: int <br/> especialidad: String| Veterinario() |  |
| **Recepcionista** | `Concreta` | turno: turno| Recepcionista() |  |

### Package: modelo.mascotas
| Clase candidata | Tipo | Atributos principales | Responsabilidades (metodos) | Justificacon | 
| :---: | :---: | :--- | :--- | :--- |
| **Mascota** | `Abstracta` | nombre: String <br/> edad: int <br/> peso: int| Mascota() <br/> emitirSonido(): void |  |
| **Gato** | `Concreta` | esDomestico: boolean| Gato() <br/> emitirSonido(): void |  |
| **Perro** | `Concreta` | raza: String <br/> nivelEnergia: int| Perro() <br/> emitirSonido(): void |  |
| **Perro** | `Concreta` | envergaduraAlas: int| AveExotica() <br/> emitirSonido(): void |  |

### Package: modelo.Clinica

| Clase candidata | Tipo | Atributos principales | Responsabilidades (métodos) | Justificación |
| :---: | :---: | :--- | :--- | :--- |
| **modelo.Clinica** | `Concreta` | nombre: String <br/> telefono: int <br/> direccion: String | modelo.Clinica(nombre: String, telefono: int, direccion: String) | Representa la entidad principal del establecimiento de salud veterinaria. |
| **Consultorio** | `Concreta` | numero: int | Consultorio(numero: int) | Representa un espacio físico o sala específica dentro de la clínica donde se realizan las atenciones. |
| **EstadoCita** | `Enum` | Programada <br/> Atendida <br/> Cancelada | N/A | Enumera los posibles estados en los que se puede encontrar una cita médica dentro del sistema. |

### Package: modelo.servicios

| Clase candidata | Tipo | Atributos principales | Responsabilidades (métodos) | Justificación |
| :---: | :---: | :--- | :--- | :--- |
| **ConsultaGeneral** | `Concreta` | tarifaBase: int | ConsultaGeneral(tarifaBase: int) | Representa el servicio médico básico con su costo tarifario principal. |
| **Vacunacion** | `Concreta` | nombreEnfermedad: String <br/> precioVacuna: int <br/> numero: ConsultaGeneral | Vacunacion(nombreEnfermedad: String, precioVacuna: int, numero: ConsultaGeneral) | Representa la aplicación de una vacuna, vinculando la enfermedad a prevenir y la consulta en que se realiza. |
| **Cirugia** | `Concreta` | nombreCirugia: String <br/> numero: ConsultaGeneral <br/> complejidad: Complejidad | Cirugia(nombreCirugia: String, numero: ConsultaGeneral, complejidad: Complejidad) | Representa un procedimiento quirúrgico indicando su tipo, la consulta asociada y el nivel de dificultad. |
| **Cobrable** | `Interface` | N/A | calcularCosto(): int <br/> generarComprobante(): void | Establece el contrato de facturación para aquellos servicios que pueden ser cobrados y comprobados. |
| **Complejidad** | `Enum` | Compleja <br/> Dificil <br/> Intermedia <br/> Facil | N/A | Define los grados de dificultad aplicables a las cirugías. |

# Justificacion de relaciones

### Dueño y Mascota
Teniendo en un dueño puede tener varias mascotas, pero puede no tener ni una en algun momento, sim embargo una mascota
no deberia tener diferentes dueños.

