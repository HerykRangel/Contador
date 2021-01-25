package contador;

import javax.swing.JTextField;

public class Contador extends Thread {
    
    // VARIABLES DE LA CLASE
    private Integer i = 0;
    private int sleepTime;              
    private boolean sleep;
    private boolean paused;
    private Semaforo semaforo;
    private JTextField tf;
    
    // CONSTRUCTOR VACION DE LA CLASE
    public Contador(){
        
    }
    
    // CONSTRUCTOR DE LA CLASE 
    public Contador (JTextField tf) {      // RECIBE UN ETIQUETA "JTextField"
        this.tf = tf;                      // SE SETEA LA ETIQUETA RECIBIDA A LA ETIQUETA DE ESTA CLASE
        semaforo = new Semaforo();         // CREA UN OBJETO DE TIPO SEMAFORO.
    }
    
    @Override 
    public void run() {
        while (true) {                      // BUCLE INFINITO - SIMULA UN CRONOMETRO
            try {
                if (paused) {               // SI "Paused" ES "TRUE", SE SUSPENDE EL HILO.
                    semaforo.suspend();     // "suspend" METODO QUE COLOCA AL HILO EN "wait"
                }
                if (sleep) {                // SI "Sleep" ES "TRUE", EL HILO SE SUSPENDE "sleepTime" MILISEGUNDOS
                    int miliSegundos = sleepTime * 1000;
                    sleep(miliSegundos);      
                }
                i++;                        // SI "Susped" ES FALSO, SE SUMA 1 AL VALOR INT
                print();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    // METODO "print"
    private void print() {
        if (tf!=null) {                         // SI LA "JTextField" ES DISTINTO DE "NULL" SE SETEA EL VALOR "i" A LA ETIQUETA.
            tf.setText(i.toString());
        } else {
            System.out.println(i.toString());   // SI NO, SE IMPRIME EN CONSOLA.
        }
    }
    
    // METODOS DE LA CLASE PARA SUSPENDER, REANUDAR Y RESETEAR EL HILO. 
    public void suspender() {
        setPaused(true);                        // SI "Paused" ES "TRUE", SE SUSPENDE EL HILO.
    }

    public void reanuda() {                 
        setPaused(false);
        semaforo.resume();                      // "resume" METODO QUE "notify()" EL HILO
    }
    
    public void reset(){                        
        setPaused(true);
        i = 0;
        print();
    }
    
    // METODOS GETTER Y SETTER "semaforo"
    public Semaforo getSemaforo() {    
        return semaforo;
    }
    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }
    
    // METODOS GETTER Y SETTER "i"
    public Integer getI() {
        return i;
    }
    public void setI(Integer i) {
        this.i = i;
    }
    
    // METODOS GETTER Y SETTER "sleepTime"
    public int getSleepTime() {
        return sleepTime;
    }
    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    // METODOS GETTER Y SETTER "tf"
    public JTextField getTf() {
        return tf;
    }
    public void setTf(JTextField tf) {
        this.tf = tf;
    }
    
    // METODOS GETTER Y SETTER "paused"
    public boolean isPaused() {
        return paused;
    }
    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    // METODOS GETTER Y SETTER "sleep"
    public boolean isSleep() {
        return sleep;
    }
    public void setSleep(boolean sleep) {           // SI "Sleep" ES "TRUE", EL HILO SE SUSPENDE "sleepTime" MILISEGUNDOS.
        this.sleep = sleep;                         // SI "Sleep" ES "FALSE" EL HILO CORRE A LA VELOCIDAD DEL BUCLE.
    }
}
