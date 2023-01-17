package Ejercicio_polimorfismo;

public class Principal {
    public static void main(String[] args) {
    Animal a;
    a= new Lion();
    a.speak();

    a = new Bird();
    a.speak();
    ((Bird)a).fly();


    }



}
