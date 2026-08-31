# DOSW_BITACORA
Bitacora clase Desarrollo y Operaciones orientado por Software

## Semana 1 - Streams Basicos

### Ejercicio 1: Números pares mayores a diez
Se utiliza el método filter para evaluar que cada número sea divisible entre dos y estrictamente mayor a diez. Finalmente, el flujo resultante se recopila en una lista inmutable mediante el método toList.

![imagen1](docs/images/s1s1.png)

### Ejercicio 2: Cantidad de palabras con más de 4 caracteres
Se filtran las palabras cuya longitud es superior a cuatro caracteres con filter, luego se transforman a mayúsculas con map y se ordenan alfabéticamente mediante sorted. Por último, se obtiene la cantidad total de palabras resultantes empleando la operación terminal count.

![imagen2](docs/images/s1s2.png)

### Ejercicio 3: Obtener nombres de los usuarios
Se aplica filter para conservar únicamente los usuarios que cuentan con su estado activo en verdadero. A continuación, mediante map se extraen sus nombres convertidos a mayúsculas, se ordenan alfabéticamente con sorted y se almacenan en una lista final mediante toList.

![imagen3](docs/images/s1s3.png)
### Ejercicio 4: Personas mayores de edad
Se utiliza filter para seleccionar los usuarios cuya edad es mayor o igual a 18 años. Posteriormente, se aplica map para extraer únicamente los nombres de las personas filtradas y se retorna la colección resultante en una lista con toList.

![imagen4](docs/images/s1s4.png)
### Ejercicio 5: Transacciones bancarias
Se emplea peek para imprimir en consola cada transacción conforme es procesada en el flujo. Luego, con anyMatch se verifica si existe al menos una transacción que no haya sido aprobada, permitiendo validar el lote como verdadero únicamente cuando todas las transacciones son válidas.

![imagen5](docs/images/s1s5.png)