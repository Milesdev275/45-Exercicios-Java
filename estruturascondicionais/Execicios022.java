package flamingo.exercicios.estruturascondicionais;

public class Execicios022 {
    static void main(String[] args) {
        double nota = 8.0;

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
