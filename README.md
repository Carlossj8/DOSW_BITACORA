# DOSW_BITACORA
Bitacora clase Desarrollo y Operaciones orientado por Software
<<<<<<< Updated upstream
=======

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

## Semana 2 - Pokémon

### Ejercicio 1: Pokémon Tipo Fuego
Se utiliza filter para comprobar que el tipo de cada Pokémon coincida con Fuego, ignorando mayúsculas y minúsculas. Luego se extraen los nombres mediante map y se recopilan en una lista con toList.

![imagen1](docs/images/s2p1.png)

### Ejercicio 2: Pokédex Gritona
Se procesa el flujo de nombres aplicando la función map junto con toUpperCase para convertir cada elemento a mayúsculas, entregando la lista de nombres transformada.

![imagen2](docs/images/s2p2.png)

### Ejercicio 3: Poder Total del Equipo
Se utiliza el método reduce con un valor inicial de cero y el operador de suma para acumular y calcular el nivel total combinado de todos los Pokémon del equipo.

![imagen3](docs/images/s2p3.png)

### Ejercicio 4: Pokémon Alfa
Se emplea la operación terminal max junto con un comparador por el atributo nivel para encontrar el Pokémon que posee el nivel más alto del equipo.

![imagen4](docs/images/s2p4.png)

### Ejercicio 5: Pokémon Legendarios
Se aplica filter para conservar únicamente los Pokémon cuyo nivel sea estrictamente mayor a 80 y se utiliza count para contabilizar la cantidad total resultante.

![imagen5](docs/images/s2p5.png)

### Ejercicio 6: Pokédex Sin Duplicados
Se utiliza la operación intermedia distinct sobre el flujo de nombres para eliminar elementos repetidos y conservar únicamente una ocurrencia de cada Pokémon.

![imagen6](docs/images/s2p6.png)

### Ejercicio 7: Orden del Profesor Oak
Se aplica el método sorted sobre la lista de nombres para ordenarlos alfabéticamente de manera natural antes de almacenarlos en la lista final.

![imagen7](docs/images/s2p7.png)

### Ejercicio 8: Evoluciones Preparadas
Se filtran los Pokémon cuyo atributo booleano indica que pueden evolucionar, se extraen sus nombres mediante map y se retornan en una lista final.

![imagen8](docs/images/s2p8.png)

### Ejercicio 9: Equipo Élite
Se utiliza filter sobre la colección de objetos Pokémon para seleccionar exclusivamente aquellos cuyo poder de combate supera los 500 puntos.

![imagen9](docs/images/s2p9.png)

### Ejercicio 10: Pokédex Compacta
Se emplea map para transformar la lista de objetos Pokémon extrayendo únicamente el atributo nombre de cada uno y se recopila el resultado mediante collect.

![imagen10](docs/images/s2p10.png)
>>>>>>> Stashed changes
