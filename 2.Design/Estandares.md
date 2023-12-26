# Juego del Cruce del Río

## 1.- Elementos del Juego

1. **Observador:** El jugador que supervisa el cruce del río.
2. **Lobo (L):** Un animal que no puede quedarse solo con la Caperucita.
3. **Caperucita (C):** Una niña que no puede quedarse sola con las Uvas.
4. **Uvas (U):** Unas uvas que no pueden quedarse solas con la Caperucita.
5. **Nada (N):** Cuando el observador regresa del rio sin traer de vuelta a ningun personaje.

## 2.- Estados del Juego

El juego se representa mediante dos listas: leftSide (lado izquierdo) y rightSide (lado derecho), que contienen los elementos presentes en cada lado del río.

### Método imprimirEstado

 Este método imprime el estado actual del juego, mostrando los personajes en la salida, los personajes en la llegada y la orilla actual (salida o llegada).

### Método imprimirPersonajes

Método privado que imprime los personajes en la salida o llegada, filtrando los valores nulos y mostrándolos en la consola.

### Método movimientos

Este método maneja los movimientos de los personajes. Si se proporciona "N" (Nada), cambia la posición del jugador (de salida a llegada o viceversa). De lo contrario, mueve el personaje especificado desde la orilla actual a la otra.

### Método encontrarPersonaje

Método privado que devuelve el índice de un personaje dado en el arreglo de personajes o -1 si no se encuentra.

### Método ganador

Este método devuelve true si todos los personajes han llegado a la llegada, lo que indica que el jugador ha ganado.

### Método perdidaSalida

Este método verifica si se ha perdido el juego en la salida. Devuelve true si todos los personajes están en la salida o si la Caperucita está junto con el Lobo o con las Uvas en la salida.

### Método perdidaLlegada

Este método verifica si se ha perdido el juego en la llegada. Devuelve true si la Caperucita está junto con el Lobo o con las Uvas en la llegada después de realizar un movimiento específico.
