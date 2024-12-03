package oop_practice3;

//RedDrug class increases life points
public class RedDrug extends Drug {
 private int addLife;

 // Constructor
 public RedDrug(String size) {
     super(size);
     switch (size) {
         case "Large":
             this.addLife = 120;
             break;
         case "Medium":
             this.addLife = 80;
             break;
         case "Small":
             this.addLife = 50;
             break;
         default:
             throw new IllegalArgumentException("Invalid size for RedDrug");
     }
 }

 // Returns the life points added
 @Override
 public int getEffect() {
     return addLife;
 }
}

