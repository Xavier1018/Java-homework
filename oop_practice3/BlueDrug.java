package oop_practice3;

//BlueDrug class increases magic points
public class BlueDrug extends Drug {
 private int addMagic;

 // Constructor
 public BlueDrug(String size) {
     super(size);
     switch (size) {
         case "Large":
             this.addMagic = 100;
             break;
         case "Medium":
             this.addMagic = 60;
             break;
         case "Small":
             this.addMagic = 30;
             break;
         default:
             throw new IllegalArgumentException("Invalid size for BlueDrug");
     }
 }

 // Returns the magic points added
 @Override
 public int getEffect() {
     return addMagic;
 }
}


