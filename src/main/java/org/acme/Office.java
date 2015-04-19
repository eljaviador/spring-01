package org.acme;

/**
 * @author Franky Villadiego
 */
public class Office {
    private Printer printer;
    private String messageToPrint;

    public Office(Printer p){
        this.printer = p;
    }

    public void setMessageToPrint(String messageToPrint) {
        this.messageToPrint = messageToPrint;
    }

    public void print(){
        printer.print(messageToPrint);
    }
}
