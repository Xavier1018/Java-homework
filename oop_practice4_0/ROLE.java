package oop_practice4_0;

//Parent class for all character roles
public class ROLE {
 protected String name;
 protected int life;
 protected int magic;

 // Constructor with parameters for initializing name, life, and magic
 public ROLE(String name, int life, int magic) {
     this.name = name;
     this.life = life;
     this.magic = magic;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Getter method for life
 public int getLife() {
     return life;
 }

 // Getter method for magic
 public int getMagic() {
     return magic;
 }

 // Overriding toString() method for printing status
 @Override
 public String toString() {
     return "Name: " + name + ", Life: " + life + ", Magic: " + magic;
 }
}
