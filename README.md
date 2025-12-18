DESCRIPCIÓN DEL PROYECTO:
Este proyecto consiste en el sistema de administracion de un restaurante utilizando estructuras de datos como ser: Colas, Listas Enlazadas y Árboles binarios

DEPENDENCIAS:
Para compilar este proyecto es necesario tener las siguientes librerias .JAR:
- AbsoluteLayout.jar
- itextpdf-5.5.1.jar
Estas estan incluidas en el proyecto, en la carpeta de "Referenced Libraries" o en la ruta "src\Librerias"

COMO COMPILAR/EJECUTAR:
Para compilar el proyecto se debe ejecutar el archivo "Main_Restaurante.java", una vez ejecutandose se carga la interfaz gráfica de "login"
las credenciales disponibles para acceder al sistema son:

- user: felipe@ucb.edu.bo password: 1234 rol: Administrador
- user: andrea@ucb.edu.bo password: 1234 rol: Administrador
- user: yerko@ucb.edu.bo password: 1234 rol: Asistente
- user: yudith@ucb.edu.bo password: 1234 rol: Asistente

la diferencia entre los usuarios de Administrador y Asistente es que en la interfaz de administración del restaurante a los usuarios "Asistente"
no les aparece los botones de "Config" y "Usuarios"
una vez ingresadas las credenciales de usuario se carga la interfaz de administración del restaurante

EJEMPLOS DE USO:
Algunos ejemplos de uso del sistema:

Nota: El sistema no tiene platos creados, asi que para empezar a usarlo es necesario añadir platos de comida primero, gestionados por una ListaEnlazada, los pedidos generados se gestionan
por una cola y la busqueda de usuarios por una estructura de árbol

Crear platos: Click en boton "Platos", en el panel "Platos del Día" introducir el nombre y el precio del plato a añadir, presionar el botón "Guardar"

Editar platos: (debe estar creado un plato para funcionar) en el panel al lado de "Platos del Día" seleccionar algun plato haciendo doble click, los datos de ese plato apareceran en
el panel "Platos del Día", ahi puede modificar los datos y para guardarlos seleccione el botón "Editar", el plato seleccionado se guardara con los nuevos datos

Hacer reservas de mesas: Click en el ícono superior izquierdo de "Speed Grill", click en la mesa que se quiere reservar, en el panel derecho de "Platos del día" seleccione un plato,
click en el boton "+", si se quiere añadir mas platos se debe repetir los 2 pasos anteriores, una vez finalizado de agregar los platos click en "Realizar Pedido"

Finalizar Pedidos: Click en la mesa de color rojo (esto indica que la mesa esta ocupada), click en el botón "Finalizar", cuando se despliegue el mensaje "Generar Recibo" dar click en "Si"

Agregar nuevos usuarios: En el panel izquiero click en el botón "Usuarios", en el panel de "Nuevo Usuario" añadir los datos del nuevo usuario (correo electrónico, password, nombre, rol),
click en el botón "Registrar"

Eliminar usuarios: Para eliminar usuarios seleccionar el usuario a eliminar, dar click en el botón de "Eliminar"






