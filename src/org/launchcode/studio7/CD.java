package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    
    public CD(String name, double storageCapacity) {
        super(name, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("I spin extra fast");
    }

    @Override
    public double storeData() {
        return getStorageCapacity();
    }

    @Override
    public void readData() {
        System.out.println("read it, thanks!");
    }

    @Override
    public void writeData() {
        System.out.println("done, written.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
