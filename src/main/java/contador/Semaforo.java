package contador;

public class Semaforo {
    
    // CONSTRUCTOR VACIO DE LA CLASE
    public Semaforo(){
        
    }
    
    // SUSPENDE EL HILO
    public  synchronized void suspend() {
        try {
            wait();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
    }

    // SACA DE ESPERA AL HILO
    public  synchronized void resume() {
        notify();
    }  
}
