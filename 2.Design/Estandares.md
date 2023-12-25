# Juego del Cruce del Río

## 1.- Elementos del Juego

1. **Observador (O):** El jugador que supervisa el cruce del río.
2. **Lobo (L):** Un animal que no puede quedarse solo con la Caperucita.
3. **Caperucita (C):** Una niña que no puede quedarse sola con las Uvas.
4. **Uvas (U):** Unas uvas que no pueden quedarse solas con la Caperucita.

## 2.- Estados del Juego

El juego se representa mediante dos listas: leftSide (lado izquierdo) y rightSide (lado derecho), que contienen los elementos presentes en cada lado del río.

### Método printState

La función printState imprime el estado actual del juego, mostrando los elementos en cada lado del río.

### Método isGameOver

La función isGameOver verifica si el juego ha terminado, es decir, si todos los elementos han cruzado al lado derecho.

### Método isDangerousState

La función isDangerousState determina si el estado actual del juego es peligroso, es decir, si se violan ciertas reglas.

### Método checkDangerousState

La función checkDangerousState imprime mensajes de advertencia si se encuentra en un estado peligroso.