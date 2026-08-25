package flamingo.exercicios.estruturascondicionais;

public class Execicios023 {
    static void main(String[] args) {
        double salario = 2500.0;

        if (salario <= 1500) {
            System.out.println("Salário baixo");
        } else if (salario <= 3000) {
            System.out.println("Salário médio");
        } else if (salario <= 7000) {
            System.out.println("Salário bom");
        } else {
            System.out.println("Salário alto");
        }
    }
}
