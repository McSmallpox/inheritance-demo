package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {

  public CanisLupusFamiliaris() {
    System.out.println("CanisLupusFamiliaris::new");
  }
  @Override
  public void vocalize() {
    System.out.println("Bark!");
  }

  @Override
  public String toString() {
     return super.toString() + "and I am a good boy.";
  }

  public static void about() {
    System.out.println("Canis lupus familiaris is a subspecies of Canis lupus, reduced by selective breeding.");
 }
  
}
