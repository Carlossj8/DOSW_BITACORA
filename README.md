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


## Semana 3 - Patrones de Diseño

### Ejercicio 1: Procesador de pagos

Se implementa el patrón de diseño creacional Factory Method para desacoplar el procesamiento general de los pagos de las subclases concretas de cada pasarela. La interfaz Payment establece el contrato común (pay), mientras que clases como CreditCardPayment, PaypalPayment y BankTransferPayment definen la ejecución particular de cada pasarela. Por su parte, la clase abstracta PaymentProcessor orquesta la lógica del negocio mediante el método processPayment, delegando la instanciación directa del objeto a las subclases especializadas (CreditCardProcessor, PaypalProcessor y BankTransferProcessor) a través del método fábrica abstracto createPayment. Esto permite que el cliente en Main opere únicamente con las abstracciones, facilitando la adición de nuevos métodos de pago sin alterar el código existente.

![imagen1](docs/images/s3s1.png)

### Ejercicio 2: Motor de videojuegos para consolas (Abstract Factory)

Se implementa el patrón de diseño creacional Abstract Factory para permitir que la clase GameEngine construya e interactúe con familias completas de componentes compatibles (Controller, Game y UI) sin acoplarse a implementaciones concretas de consolas específicas. La interfaz fábrica ConsoleFactory define los métodos de creación (createController, createGame y createUI), los cuales son implementados por las fábricas concretas PlayStationFactory y XboxFactory. Cada fábrica garantiza la creación de componentes de una misma familia (por ejemplo, PlayStationController, PlayStationGame y PlayStationUI). De esta forma, el motor de juego GameEngine recibe cualquier fábrica que implemente ConsoleFactory e inicia el sistema mediante el método run, logrando que la adición de nuevas plataformas (como Nintendo o PC) no afecte la lógica central del cliente.

![imagen2](docs/images/s3s2.png)

### Ejercicio 3: Fábrica de muñecos (Builder)

Se implementa el patrón de diseño creacional Builder para separar el proceso de construcción paso a paso de un objeto complejo (ToyDoll) de su representación final. La interfaz ToyDollBuilder establece los pasos estándar del ensamblaje (buildHead, buildBody, buildArms, buildLegs y addAccessories). Las clases constructoras concretas ActionDollBuilder y ClassicDollBuilder implementan estos pasos asignando características específicas a cada tipo de muñeco. Por su parte, la clase constructora/directora ToyFactory controla la secuencia exacta de llamadas al builder recibido mediante el método constructDoll. Esto permite que el cliente en Main obtenga diferentes variantes de muñecos reutilizando el mismo algoritmo de ensamblaje.

![imagen3](docs/images/s3s3.png)

### Ejercicio 4: Estación de servicio inteligente para vehículos (Adapter)

Se implementa el patrón de diseño estructural Adapter para permitir que la estación de servicio (SmartGasStation) interactúe de forma unificada con distintos tipos de cargadores eléctricos (FastElectricCharger y SlowElectricCharger) mediante la interfaz estándar FuelService. Dado que las interfaces de los cargadores eléctricos son incompatibles con el método supply(amount) de la gasolinera tradicional, las clases adaptadoras FastChargerAdapter y SlowChargerAdapter convierten la solicitud en litros a su equivalente en kWh (multiplicando los litros por 8.0 en el modelo rápido y por 7.0 en el modelo lento) y delegan la ejecución a los métodos específicos fastCharge y slowCharge. De esta manera, el sistema central funciona de forma transparente utilizando únicamente la interfaz objetivo.

![imagen4](docs/images/s3s4.png)

### Ejercicio 5: Figuras geométricas y colores (Bridge)

Se implementa el patrón de diseño estructural Bridge para desacoplar la abstracción de las formas geométricas (Forma) de la implementación de los colores (Color), evitando una explosión combinatoria de subclases por herencia múltiple. La clase abstracta Forma mantiene una referencia por composición hacia la interfaz Color. Las subclases de formas (Circulo y Cuadrado) delegan la obtención del color a las clases concretas de color (Rojo y Azul) mediante el método aplicarColor(). De esta forma, es posible agregar nuevas formas geométricas o nuevos colores de manera independiente sin modificar la jerarquía existente.

![imagen5](docs/images/s3s5.png)

### Ejercicio 6: Inventario de bodega y cajas compuestas (Composite)

Se implementa el patrón de diseño estructural Composite para tratar de manera uniforme tanto a productos individuales (Product) como a contenedores o cajas compuestas (Box) que pueden incluir otros productos o cajas anidadas. La interfaz común Item define la operación getPrice(). La clase hoja Product retorna su precio individual, mientras que la clase compuesta Box mantiene una lista de elementos (List<Item>) y calcula su precio total de forma recursiva al recorrer todos sus ítems contenidos. Esto permite que el cliente WarehouseApp consulte el precio total de cualquier paquete o elemento sin necesidad de diferenciar si se trata de un objeto simple o una estructura compleja de cajas.

![imagen6](docs/images/s3s6.png)

### Ejercicio 7: Simulador naval y módulos de barcos (Decorator)

Se implementa el patrón de diseño estructural Decorator para añadir capacidades dinámicas (ataque y defensa) y descripciones a un barco en tiempo de ejecución sin alterar su clase original ni recurrir a la creación masiva de subclases combinatorias. La interfaz Barco define los métodos principales (getDescripcion(), poderAtaque() y defensa()), implementados de forma base por la clase BarcoBase. La clase abstracta BarcoBaseDecorador actúa como envoltorio base manteniendo una referencia a un objeto de tipo Barco. Los decoradores concretos (BlindajeDecorador, RadarDecorador, MisilesDecorador y AntiTorpedosDecorador) extiende de dicho envoltorio y agregan sus bonificaciones correspondientes sobre las métricas del barco envuelto. Además, mediante la API de Streams y Lambdas de Java, la aplicación permite encadenar y aplicar dinámicamente cualquier lista de módulos de configuración sobre la embarcación.

![imagen7](docs/images/s3s7.png)

### Ejercicio 8: Controles migratorios de ingreso (Chain of Responsibility)

Se implementa el patrón de diseño de comportamiento Chain of Responsibility para procesar secuencialmente las verificaciones de ingreso a un país (pasaporte/visa, antecedentes, motivos del viaje y aprobación final). La interfaz ControlMigratorio y su clase abstracta base ControlMigratorioHandler establecen la estructura del manejador y el enlace al siguiente elemento de la cadena mediante setSiguiente(). Cada manejador concreto (PasaporteControl, AntecedentesControl, MotivoViajeControl y AprobacionFinalControl) evalúa la solicitud (IngresoRequest) y decide si aprueba el paso delegando la ejecución al siguiente eslabón mediante super.procesar(request), o si detiene el proceso inmediatamente en caso de rechazo, desacoplando completamente al solicitante de los controles individuales.

![imagen8](docs/images/s3s8.png)

### Ejercicio 9: Acciones de personaje de videojuego (Command)

Se implementa el patrón de diseño de comportamiento Command para encapsular cada una de las acciones de un personaje de videojuego (caminar, saltar, atacar y defenderse) en objetos independientes que implementan la interfaz Command (`execute()`). El personaje `GameCharacter` actúa como receptor (Receiver) definiendo la lógica concreta de cada acción. Los comandos concretos (`WalkCommand`, `JumpCommand`, `AttackCommand` y `DefendCommand`) mantienen una referencia al personaje y delegan la ejecución correspondiente. Por su parte, la clase `GameController` actúa como invocador (Invoker) ejecutando el comando recibido mediante `pressButton(command)` sin conocer los detalles de implementación interna de la acción ni del personaje.

![imagen9](docs/images/s3s9.png)

### Ejercicio 10: Recorrido turístico por Roma (Iterator)

Se implementa el patrón de diseño de comportamiento Iterator para permitir la secuenciación y exploración de los lugares emblemáticos de Roma (Colosseum, Roman Forum, Trevi Fountain, Pantheon y Spanish Steps) sin exponer la estructura de datos interna subyacente. La interfaz `Iterator<T>` declara los métodos `hasNext()` y `next()`, mientras que la interfaz `Aggregate<T>` define el método de fabricación `createIterator()`. La clase contenedora `TourRoute` almacena internamente un arreglo privado de objetos `Place` e implementa la interfaz de agregación instanciando un iterador privado (`RomeIterator`). De este modo, la clase cliente `Tourist` recorre la ruta turística mediante `exploreTour(route)` operando únicamente a través de la interfaz abstracta del iterador.

![imagen10](docs/images/s3s10.png)

### Ejercicio 11: Aplicación de navegación y rutas (Strategy)

Se implementa el patrón de diseño de comportamiento Strategy para intercambiar dinámicamente los algoritmos de cálculo de ruta según la preferencia del usuario (más rápida, turística o más económica) sin modificar el código cliente de la aplicación. La interfaz `RouteStrategy` establece el contrato común mediante el método `calculateRoute()`. Las estrategias concretas (`FastestRoute`, `ScenicRoute` y `CheapestRoute`) encapsulan los algoritmos específicos de navegación. La clase contexto `NavigationApp` mantiene una referencia a la estrategia activa y permite cambiarla en tiempo de ejecución a través de `setRouteStrategy()`, ejecutando el cálculo correspondiente al invocar `startNavigation()`.

![imagen11](docs/images/s3s11.png)










