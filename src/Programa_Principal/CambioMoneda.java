package Programa_Principal;

/**
 * Created by farias on 30/03/16.
 */
public class CambioMoneda implements MonedaTDA {
    private Moneda[] monedas = Moneda.values();
    public void calcularCambio (float monto){
        int m=Math.round(monto*100);
        for(int i=0;i<monedas.length;i++){
            if(m>=monedas[i].valor()){
                monedas[i].setCantidad(m/monedas[i].valor());
                m-= monedas[i].valor()*monedas[i].cantidad();
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Moneda m: monedas){
            if(m.cantidad()>0){
                sb.append(m);
            }
        }
        return sb.toString();
    }
}
