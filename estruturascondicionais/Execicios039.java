package flamingo.exercicios.estruturascondicionais;

public class Execicios039 {
    public static void main(String[] args) {
        double valorCompra = 200.0;

        double frete = (valorCompra >= 150) ? 0 : 20;

        System.out.println("Valor do frete: " + frete);
    }
}
