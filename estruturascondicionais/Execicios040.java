package flamingo.exercicios.estruturascondicionais;

public class Execicios040 {
    public static void main(String[] args) {
        double salario = 2500.0;

        double bonus = (salario < 3000) ? 500 : 200;

        System.out.println("Valor do bônus: " + bonus);
    }
}
