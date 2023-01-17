package Ejercicio_polimorfismo;

public class MainInstrumento {
    public static void main(String[] args) {
        Instrumento i;
        i = new Guitarra();
        i.tocar();

        i=new Tambor();
        i.tocar();
    }
}
