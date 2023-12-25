# Historias de usuario

| HU-01: Regla 1 |
| --- |
| **Historia de usuario:** Como usuario, quiero poder seleccionar y mover los personajes (lobo, caperucita y uvas) a través del río utilizando un barco manejado por el observador. El observador no puede bajarse del barco y solo puede transportar un personaje a la vez. |
| **Criterio de aceptación:** |
| 1. El usuario puede seleccionar uno de los tres personajes (lobo, caperucita, uvas) para ser transportado por el barco. |
| 2. Solo se permite un personaje en el barco en cualquier momento, además del observador. |
| 3. Una vez que un personaje ha sido transportado con éxito al otro lado del río, el usuario debe poder seleccionar y transportar otro personaje. |

| HU-2: Regla 2 |
| --- |
| **Descripción:** Si el lobo está solo con caperucita, entonces el lobo se come a caperucita. Si caperucita está sola con las uvas, entonces caperucita se come las uvas. |
| **Historia de Usuario:** Como usuario del programa de validación de movimientos, quiero asegurarme de que las interacciones entre el lobo, caperucita y la uva estén correctamente validadas, para garantizar que el lobo nunca se quede solo con caperucita y que caperucita nunca se quede solo con la uva. Esto es esencial para mantener la integridad de la historia y evitar situaciones inapropiadas. |
| **Criterios de Aceptación:** |
| 1. Cuando el lobo y caperucita están en la misma ubicación, la validación debe ser exitosa si hay presencia de al menos otro personaje (por ejemplo, la uva). |
| 2. La validación debe fallar si el lobo está solo con caperucita, indicando un movimiento incorrecto. |
| 3. Cuando caperucita y la uva están en la misma ubicación, la validación debe ser exitosa si hay presencia de al menos otro personaje (por ejemplo, el lobo). |
| 4. La validación debe fallar si caperucita está sola con la uva, indicando un movimiento incorrecto. |

| HU-03: Regla 3 |
| --- |
| **Descripción:** Si el movimiento es erróneo se debe recibir retroalimentación. |
| **Historia Usuario:** Como usuario del juego, quiero recibir retroalimentación clara a través de mensajes cuando realice un movimiento incorrecto. Además, deseo saber cuándo he ganado el juego, es decir, cuando los tres personajes hayan cruzado con éxito al otro lado del río. Esta retroalimentación es esencial para mejorar mi experiencia de juego y comprender mi progreso. |
| **Criterios de Aceptación:** |
| - Los mensajes de error generados por la validación deben ser claros y descriptivos, facilitando la comprensión del usuario sobre el problema en el movimiento. |
