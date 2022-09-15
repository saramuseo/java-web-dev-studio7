package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, double storageCapacity) {
        super(name, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("I'm spinning very fast.");
    }

    @Override
    public double storeData() {
        return getStorageCapacity();
    }

    @Override
    public void readData() {
        System.out.println("your data has been read");
    }

    @Override
    public void writeData() {
        System.out.println("written data!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
