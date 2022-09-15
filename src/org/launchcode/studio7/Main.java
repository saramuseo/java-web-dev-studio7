package org.launchcode.studio7;


public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Goo Goo Dolls", 12.24);
        DVD myDVD = new DVD("Drop Dead Fred", 240);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myDVD.spinDisc();
    }
}
