package edu.cnm.deepdive;

public abstract class Canis {
  
  public static final int NUMBER_OF_LEGS = 4;
  
  public abstract void vocalize(); //an abstract method means it doesn't need a body to be defined.
  //in order to have an abstract method in your class, the class *must* be abstract. the reverse is *not* true.
  
  public abstract void hunt();

  @Override
  public String toString() {
     return "I am a " + this.getClass().getSimpleName();
  }

  
}
