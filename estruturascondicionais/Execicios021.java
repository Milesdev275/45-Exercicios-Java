package flamingo.exercicios.estruturascondicionais;

public class Execicios021 {
    static void main(String[] args) {
        int idade = 15;

        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
