package flamingo.exercicios.estruturascondicionais;

public class Execicios041 {
    public static void main(String[] args) {
        double nota = 6.0;
        double presenca = 80.0;

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
