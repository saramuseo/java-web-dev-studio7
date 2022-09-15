package org.launchcode.studio7;

public abstract class BaseDisc {

   private int numberOfSides;
   private String name;
   private String contentType;
   private String discType;
   private double storageCapacity;


   public BaseDisc (String name, double storageCapacity) {
      this.name = name;
      this.storageCapacity = storageCapacity;
   }


   @Override
   public String toString() {
      return "Disc Information - \n" +
              "name: " + name + '\n' +
              "content: " + contentType + '\n' +
              "type of disc: " + discType + '\n' +
              "capacity (MB): " + storageCapacity;
   }

   public int getNumberOfSides() {
      return numberOfSides;
   }

   public void setNumberOfSides(int numberOfSides) {
      this.numberOfSides = numberOfSides;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getContentType() {
      return contentType;
   }

   public void setContentType(String contentType) {
      this.contentType = contentType;
   }

   public String getDiscType() {
      return discType;
   }

   public void setDiscType(String discType) {
      this.discType = discType;
   }

   public double getStorageCapacity() {
      return storageCapacity;
   }

   public void setStorageCapacity(double storageCapacity) {
      this.storageCapacity = storageCapacity;
   }
}
