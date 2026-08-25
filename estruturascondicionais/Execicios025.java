package flamingo.exercicios.estruturascondicionais;

public class Execicios025 {
    static void main(String[] args) {
        int xp = 6000;

        if (xp < 1000) {
            System.out.println("Iniciante");
        } else if (xp <= 4999) {
            System.out.println("Intermediário");
        } else if (xp <= 9999) {
            System.out.println("Avançado");
        } else {
            System.out.println("Lendário");
        }

    }
}
