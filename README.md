# DOSW_BITACORA
Bitacora clase Desarrollo y Operaciones orientado por Software

## Semana 1 - Streams Basicos

### Ejercicio 1: Números pares mayores a diez
Se utiliza el método filter para evaluar que cada número sea divisible entre dos y strictly mayor a diez. Finalmente, el flujo resultante se recopila en una lista inmutable mediante el método toList.

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

## Semana 2 - Pokemon

### Ejercicio 1: Pokemon Tipo Fuego
Se utiliza filter para comprobar que el tipo de cada Pokemon coincida con Fuego, ignorando mayusculas y minusculas. Luego se extraen los nombres mediante map y se recopilan en una lista con toList.

![imagen1](docs/images/s2p1.png)

### Ejercicio 2: Pokedex Gritona
Se procesa el flujo de nombres aplicando la funcion map junto con toUpperCase para convertir cada elemento a mayusculas, entregando la lista de nombres transformada.

![imagen2](docs/images/s2p2.png)

### Ejercicio 3: Poder Total del Equipo
Se utiliza el metodo reduce con un valor inicial de cero y el operador de suma para acumular y calcular el nivel total combinado de todos los Pokemon del equipo.

![imagen3](docs/images/s2p3.png)

### Ejercicio 4: Pokemon Alfa
Se emplea la operacion terminal max junto con un comparador por el atributo nivel para encontrar el Pokemon que posee el nivel mas alto del equipo.

![imagen4](docs/images/s2p4.png)

### Ejercicio 5: Pokemon Legendarios
Se aplica filter para conservar unicamente los Pokemon cuyo nivel sea estrictamente mayor a 80 y se utiliza count para contabilizar la cantidad total resultante.

![imagen5](docs/images/s2p5.png)

### Ejercicio 6: Pokedex Sin Duplicados
Se utiliza la operacion intermedia distinct sobre el flujo de nombres para eliminar elementos repetidos y conservar unicamente una ocurrencia de cada Pokemon.

![imagen6](docs/images/s2p6.png)

### Ejercicio 7: Orden del Profesor Oak
Se aplica el metodo sorted sobre la lista de nombres para ordenarlos alfabeticamente de manera natural antes de almacenarlos en la lista final.

![imagen7](docs/images/s2p7.png)

### Ejercicio 8: Evoluciones Preparadas
Se filtran los Pokemon cuyo atributo booleano indica que pueden evolucionar, se extraen sus nombres mediante map y se retornan en una lista final.

![imagen8](docs/images/s2p8.png)

### Ejercicio 9: Equipo Elite
Se utiliza filter sobre la coleccion de objetos Pokemon para seleccionar exclusivamente aquellos cuyo poder de combate supera los 500 puntos.

![imagen9](docs/images/s2p9.png)

### Ejercicio 10: Pokedex Compacta
Se emplea map para transformar la lista de objetos Pokemon extrayendo unicamente el atributo nombre de cada uno y se recopila el resultado mediante collect.

![imagen10](docs/images/s2p10.png)

### Ejercicio 11: Poder Promedio
Se transforma el flujo de valores de poder de combate a tipos primitivos mediante mapToDouble y se calcula su media empleando la operacion terminal average.

![imagen11](docs/images/s2p11.png)

### Ejercicio 12: Campeon Regional
Se determina el Pokemon con mayor poder de combate del equipo utilizando la operacion terminal max junto con un comparador numerico por el atributo poderCombate.

![imagen12](docs/images/s2p12.png)

### Ejercicio 13: Organizar por Tipo
Se agrupan los Pokemon segun su tipo mediante la operacion groupingBy y se recopilan exclusivamente los nombres pertenecientes a cada grupo.

![imagen13](docs/images/s2p13.png)

### Ejercicio 14: Organizar por Region
Se utiliza groupingBy para clasificar a los Pokemon de acuerdo con su region de procedencia, generando un mapa con los nombres correspondientes a cada region.

![imagen14](docs/images/s2p14.png)

### Ejercicio 15: Maestro de Gimnasios
Se procesa el flujo de entrenadores aplicando la operacion terminal max junto con un comparador por el atributo medallas para encontrar al entrenador con mas medallas.

![imagen15](docs/images/s2p15.png)

### Ejercicio 16: Entrenadores Experimentados
Se utiliza filter con referencia a metodo para evaluar la condicion de experiencia de cada entrenador y obtener unicamente a quienes cuentan con mas de cinco medallas.

![imagen16](docs/images/s2p16.png)

### Ejercicio 17: Equipo Mas Poderoso
Se calcula la suma total del poder de combate del equipo de cada entrenador mediante mapToDouble y sum, y luego se obtiene al entrenador con la mayor acumulacion aplicando la operacion terminal max.

![imagen17](docs/images/s2p17.png)

### Ejercicio 18: Top 5 Pokemon Mas Fuertes
Se ordenan los Pokemon de forma descendente de acuerdo con su poder de combate mediante sorted y se seleccionan unicamente los cinco primeros lugares con la operacion limit.

![imagen18](docs/images/s2p18.png)

### Ejercicio 19: Top 3 Entrenadores
Se ordenan los entrenadores aplicando comparadores encadenados por medallas, poder acumulado y nombre, y se seleccionan los tres mejores mediante limit.

![imagen19](docs/images/s2p19.png)

### Ejercicio 20: Pokedex Analitica
Se realizan multiples operaciones analiticas con streams para agrupar por tipo y region con groupingBy y counting, contabilizar legendarios con filter y count, calcular el promedio de nivel con mapToInt y average, y encontrar el Pokemon mas fuerte con max.

![imagen20](docs/images/s2p20.png)

### Reto Mewtwo: Reporte de Poder Elite por Tipo
Propuesta: Se plantea un desafio para calcular el poder de combate acumulado de los Pokemon de alto nivel agrupados por su tipo elemental y organizados en un ranking de mayor a menor poder. Solucion: Se seleccionan los Pokemon con nivel mayor o igual a 50 mediante filter, se normaliza el tipo a mayusculas con map, se agrupan los poderes de combate por tipo elemental usando groupingBy, se calcula la suma acumulada de cada tipo mediante reduce y finalmente se ordenan los grupos en forma descendente con sorted.

![imagenRetoMewtwo](docs/images/s2pRetoMewtwo.png)

## Ejercicios que contienen Azucar Sintactico en lugar de lambdas

- Ejercicio 1: Pokemon::getNombre en la operacion map
- Ejercicio 2: String::toUpperCase en la operacion map
- Ejercicio 3: Integer::sum en la operacion reduce
- Ejercicio 4: Pokemon::getNivel en la operacion max con Comparator.comparingInt
- Ejercicio 8: Pokemon::isPuedeEvolucionar en la operacion filter y Pokemon::getNombre en la operacion map
- Ejercicio 10: Pokemon::getNombre en la operacion map
- Ejercicio 16: Entrenador::esExperimentado en la operacion filter
- Ejercicio 19: Entrenador::getMedallas, Entrenador::calcularPoderTotalEquipo y Entrenador::getNombre en el comparador encadenado de sorted

## Semana 4 - Taller 4: Combinacion de Patrones de Diseno

### Ejercicio 1: Plataforma de Pagos Inteligentes

Rol de cada patron:
- Strategy: Define una interfaz comun PaymentStrategy para todos los algoritmos de pago (Tarjeta, PSE, Nequi, PayPal, Stripe). Permite que la clase Checkout ejecute pagos sin conocer los detalles de implementacion de cada medio.
- Factory Method: Encapsula la logica de creacion de los objetos de pago segun el pais del usuario mediante la interfaz PaymentFactory y sus implementaciones concretas (ColombiaPaymentFactory y UsaPaymentFactory).

Interaccion entre los dos patrones:
El cliente selecciona el pais y el medio de pago. La fábrica correspondiente crea e instancia la estrategia de pago concreta requerida para ese pais. Luego, el objeto Checkout recibe dicha estrategia y llama a su metodo process(amount). De esta forma, Factory Method resuelve la responsabilidad de construir la estrategia correcta y Strategy resuelve la responsabilidad de ejecutar el pago.

Justificacion frente a una solucion sin patrones:
Sin patrones, la clase Checkout tendria multiples condicionales encadenados (if/switch) para verificar tanto el pais como el medio de pago, estando fuertemente acoplada a todas las clases concretas de pago. Agregar un nuevo pais o medio requerira modificar la clase Checkout directamente, violando el principio de Abierto/Cerrado (Open/Closed Principle). Al combinar Strategy y Factory Method, el sistema se vuelve extensible: agregar un medio de pago solo requiere crear una nueva estrategia o fabrica sin modificar Checkout ni la logica de otros pagos.

![imagenEj1Taller4](docs/images/s4t4e1.png)

### Ejercicio 2: Sistema de Notificaciones Multicanal

Rol de cada patron:
- Observer: Desacopla la entidad Pedido (Subject) de los canales de envio (EmailNotifier, SmsNotifier, PushNotifier). Permite que los canales se suscriban o desuscriban dinamicamente sin alterar la clase Pedido.
- Factory Method: Encapsula la construccion y formateo del mensaje correspondiente a cada canal mediante la interfaz MessageFactory y sus implementaciones concretas (EmailMessageFactory genera HTML, SmsMessageFactory genera texto plano y PushMessageFactory genera JSON).

Interaccion entre los dos patrones:
Cuando el estado de un Pedido cambia, la clase Pedido notifica a todos los Observers suscritos pasando un objeto OrderEvent. Cada Observer invoca a su propia MessageFactory para construir el objeto Message especifico para su medio y procede a realizar la entrega. Observer gestiona el flujo de notificaciones y la suscripcion de canales, mientras que Factory Method gestiona la creacion del formato de mensaje adecuado.

Justificacion frente a una solucion sin patrones:
Sin patrones, la clase Pedido deberia conocer directamente cada canal de comunicacion y contener logica dispersa para formatear mensajes en HTML, texto o JSON segun el estado. Esto generaria un alto acoplamiento y violaria el principio de Responsabilidad Unica (Single Responsibility Principle). La combinacion de Observer y Factory Method asegura que agregar un nuevo canal o cambiar el formato de los mensajes no requiera modificar la clase Pedido ni los demas observadores.

![imagenEj2Taller4](docs/images/s4t4e2.png)

### Ejercicio 3: Sistema de Reportes Empresariales

Rol de cada patron:
- Template Method: Estructura la secuencia fija de pasos para la generacion de reportes en la clase base ReportGenerator mediante el metodo final generate(). Mantiene fijos los pasos de obtencion de datos y procesamiento, mientras delega el formato (applyFormat) y la exportacion (exportFile) a las subclases concretas.
- Factory Method: Desacopla la instanciacion de los reportes concretos a traves de ReportFactory, permitiendo construir instancias de PdfReport, ExcelReport o CsvReport segun el parametro solicitado por el usuario sin instanciar clases concretas directamente en el cliente.

Interaccion entre los dos patrones:
El cliente solicita un tipo de reporte a ReportFactory (por ejemplo, PDF). La fabrica construye e instancia la subclase adecuada (PdfReport). Posteriormente, el cliente invoca el metodo generate() en la instancia recibida. Template Method ejecuta en orden la secuencia fija de 4 pasos, llamando a la implementacion especifica de PdfReport para aplicar el formato y exportar el archivo.

Justificacion frente a una solucion sin patrones:
Sin patrones, el cliente deberia controlar mediante condicionales cual reporte instanciar y ademas duplicaria los pasos fijos (obtener datos y procesar informacion) en cada clase de reporte. Si el flujo general de generacion cambiara, habria que modificar múltiples clases. Con Template Method se centraliza el esqueleto del algoritmo eliminando duplicacion, y con Factory Method se desacopla la creacion del objeto concreto de la logica cliente.

![imagenEj3Taller4](docs/images/s4t4e3.png)

### Ejercicio 4: Plataforma de Videojuegos — Personajes

Rol de cada patron:
- Builder: Permite la construccion paso a paso de un personaje complejo al inicio del juego mediante la clase CharacterBuilder (configurando armadura, arma y habilidades). Evita la sobrecarga de constructores con multiples parametros y simplifica la creacion de personajes base.
- Decorator: Añade habilidades y efectos especiales de forma dinamica en tiempo de ejecucion (como ShieldDecorator, SpeedDecorator e InvisibilityDecorator) envolviendo al personaje base sin modificar su clase original.

Interaccion entre los dos patrones:
Al iniciar la partida, Builder construye la instancia base del personaje con todas sus propiedades iniciales. Durante la partida, a medida que el jugador activa efectos o mejoras temporales, los Decorators envuelven dinamicamente la instancia del personaje acumulando comportamientos sobre el metodo attack(). Al finalizar la bonificacion temporal, el envoltorio se remueve sin alterar el objeto base.

Justificacion frente a una solucion sin patrones:
Sin Builder, la creacion de personajes requeriria constructores masivos difíciles de mantener. Sin Decorator, se generaria una explosion combinatoria de subclases (por ejemplo, para 5 poderes combinables se necesitarian 32 subclases distintas). Al combinar Builder y Decorator, se mantiene la creacion limpia y se permite combinar poderes dinamicamente con solo 5 envoltorios y 1 clase base.

![imagenEj4Taller4](docs/images/s4t4e4.png)

### Ejercicio 5: Integración con Sistema Bancario Antiguo

Rol de cada patron:
- Adapter: Adapta e integra la interfaz del servicio bancario antiguo (LegacyBankService) a la interfaz moderna PaymentProcessor mediante la clase LegacyBankAdapter. Traduce llamadas incompatibles, convirtiendo por ejemplo montos decimales a valores enteros en centavos y redirigiendo la ejecucion al metodo legacy correspondiente.
- Facade: Proporciona una interfaz simplificada (BankFacade) que encapsula y oculta la complejidad del flujo del banco antiguo (como la apertura de sockets, autenticacion, inicializacion de sesion y cierre de conexion).

Interaccion entre los dos patrones:
El desarrollador llama al metodo simplificado procesarPago(monto) expuesto por BankFacade. La clase Facade orquesta en orden todos los pasos de infraestructura requeridos por el banco antiguo y, al llegar al momento del pago, delega la transaccion a LegacyBankAdapter. El Adapter traduce la llamada al formato legacy (monto a centavos) y llama a LegacyBankService para realizar el cobro.

Justificacion frente a una solucion sin patrones:
Sin Adapter y Facade, los desarrolladores tendrian que conocer y replicar manualmente los 6 a 8 pasos de inicializacion tecnica cada vez que desearan realizar un pago. Ademas, el codigo cliente deberia lidiar directamente con metodos antiguos e incompatibles (como convertir manualmente decimales a centavos). Al combinar ambos patrones, Adapter resuelve la incompatibilidad de interfaces y Facade oculta la complejidad del proceso, logrando un codigo limpio, desacoplado y de facil mantenimiento.

![imagenEj5Taller4](docs/images/s4t4e5.png)