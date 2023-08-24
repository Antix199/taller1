# taller1
/* Se le pedira al usuario ingresar 2 valores, uno para filas y otro para columnas (m y n);
Los valores ingresados pasarán por un método que confirme que son numeros enteros reales (boolean validarDimensiones(int filas, int cols) ), 
de serlo se utilizarán en int [ ][ ] crearMatriz(int filas, in cols) + (<tipo> llenarMatriz(int matriz [ ][ ] ) ) para crear una matriz de esas dimensiones, de no serlo,
se le solicitará al usuario, ingresar números válidos.
Luego de tener creada la matriz, exiatirán 2 alternativas de acción para el usuario:
1- Mostrar una fila: Para esto se le pedirá al usuario ingresar la fila a mostrar, este valor será llevado a un método, que buscará la fila y la mostrará (void mostrarFila(int matriz[ ][ ], int fila))
2- Verificar si la matriz es de tipo 0:el método (boolean matrizCero(int matriz[ ][ ] )) contará la cantidad de 0´s presentes en la matriz y esa cantidad la dividirá en la cantidad de total de valores
de la matriz (mxn), si el resultado es igual o menor a 0,5 el método retornará FALSE y si es mayor a 0,5, retornará TRUE; Se retornarán mensajes en la pantalla para ambos casos.

-se creará un menú para manejar las opciones dispnibles;

(Automáticamente se le solicitarán 2 valores al usuario para crear la matriz, luego si son válidos, se les pedirá que confirmen el llenado de esta,
de no confirmar, se devolverá un mensaje y se finalizará el programa; si aprueba el llenado de la matriz, se iniciará el menú:

-------------------MENÚ-------------------
1. Mostrar valores de una fila.
2. Identificar si la matriz es de tipo 0.
3. Salir (Break)
------------------------------------------
*/
