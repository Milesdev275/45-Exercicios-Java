package flamingo.exercicios.estruturascondicionais;

public class Execicios024 {
    static void main(String[] args) {
        double temperatura = 20.0;

        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura <= 25) {
            System.out.println("Agradável");
        } else if (temperatura <= 35) {
            System.out.println("Quente");
        } else {
            System.out.println("Muito quente");
        }

    }
}
