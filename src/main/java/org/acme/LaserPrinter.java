package org.acme;

/**
 * @author Franky Villadiego
 */
public class LaserPrinter implements Printer {

    public void print(String message) {
        //Codigo para imprimir en laser
        System.out.println("Imprimiendo en Laser el mensaje :" + message);
    }
}
