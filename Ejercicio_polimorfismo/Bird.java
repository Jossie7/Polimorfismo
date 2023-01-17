package Ejercicio_polimorfismo;

public class Bird extends Animal implements Flyable {
    public void speak(){
        System.out.println("piopio");
    }
    @Override
    public void fly() {
        System.out.println("Puedo volar");
    }

}
