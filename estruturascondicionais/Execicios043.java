package flamingo.exercicios.estruturascondicionais;

public class Execicios043 {
    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteirinhaEstudante = true;

        if (idade < 12) {
            System.out.println("Paga meia (criança)");
        } else if (temCarteirinhaEstudante) {
            System.out.println("Paga meia (estudante)");
        } else {
            System.out.println("Paga inteira");
        }
    }
}
