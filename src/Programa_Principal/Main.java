/**
 * @author Facundo Arias on 30/3/2016.
 */

package Programa_Principal;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CambioMoneda a= new CambioMoneda();
        a.calcularCambio(0.12f);
        System.out.println(a.toString());


        ArrayList<User> users = new ArrayList<>();
        User c = new User();
        c.setNombre("Facundo");
        c.setApellido("Arias");
        c.setDni("3680891");
        users.add(c);

        users.forEach((v) -> System.out.printf("Nombre: %s\n",v.getNombre()));
    }
}
