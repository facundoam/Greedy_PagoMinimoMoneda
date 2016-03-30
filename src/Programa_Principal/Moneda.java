package Programa_Principal;

/**
 * Created by farias on 30/03/16.
 */
public enum Moneda {
    CINCUENTA(50),VEINTE(20),DIEZ(10),CINCIO(5),DOS(2),UNO(1);
    private int valor;
    private int cantidad;
    Moneda (int valor){
        this.valor=valor;
    }
    public int cantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public int valor(){
        return valor;
    }
    public String toString(){
     return "["+cantidad+" de "+valor+"]";
    }
}
