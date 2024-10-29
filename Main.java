public class Main {
    public static void main(String[] args) {
        Classe c1 = new Classe();
        Classe c2 = new Classe();
        Classe c3 = new Classe();

        c1.contador = 0;
        c2.contador = 2;
        c3.contador = 3;

        System.out.println("C1: " + c1.contador);
        System.out.println("C2: " + c2.contador);
        System.out.println("C3: " + c3.contador);
    }

}