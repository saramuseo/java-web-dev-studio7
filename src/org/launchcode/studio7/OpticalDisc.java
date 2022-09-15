package org.launchcode.studio7;

public interface OpticalDisc {

    public static final boolean hasPhysicalDrive = true;
    public static final boolean laserWritten =  true;
    public static final boolean readByLaser = true;

    void spinDisc();
    double storeData();
    void readData();
    void writeData();
    //String reportInformation();




}
