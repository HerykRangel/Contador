# Contador
El siguiente proyecto implementa una interfaz de un tablero que contiene una serie de contadores independientes entre ellos, los cuales operan en forma individual (start, stop, resume, reset). Cada contador al iniciarse (start) comienza a incrementar en números enteros comenzando desde el 1.

El tablero tiene las siguientes opciones:

    •	Start - Iniciar el contador

    •	Stop - Suspender el contador utilizando wait().

    •	Resume - Retomar el contador utilizando notify().

    •	Reset - Reinicia el contador utilizando wait() y seteando el valor incial “0” al contador.

    •	Priority - Asigna prioridad a los hilos.

    •	Pause - Asigna un “sleepTime” en segundos al incremento de números enteros del contador. 

Se posee una clase llamada “Contador” la cual extiende de la clase “Thread” y se encarga de ir incrementando el valor entero del contador y actualizar la interfaz gráfica.

Se posee una clase llamada “Semaforo” la cual posee métodos públicos sincronizados que suspenden (“wait()”) y reanudan (“notify()”) el hilo.

Por último, en la lógica de la interfaz se programó eventos de documento que verifica cuál de los contadores es el mayor asignándole un color (“rojo”) al mismo.

Heryk Rangel
