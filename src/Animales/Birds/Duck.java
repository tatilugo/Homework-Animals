package Animales.Birds;

import Animales.Animals;

public class Duck extends Animals implements IFlying {
   public void say() {
       System.out.println("Кря");

    }
    public void fly() {
       System.out.println("Я лечу!");
    }
}
