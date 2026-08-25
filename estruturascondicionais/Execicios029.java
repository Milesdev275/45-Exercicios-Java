package flamingo.exercicios.estruturascondicionais;

public class Execicios029 {
    static void main(String[] args) {
        double imc = 22.0;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

    }
}
