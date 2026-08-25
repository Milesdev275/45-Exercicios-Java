package flamingo.exercicios.estruturascondicionais;

public class Execicios016 {
    static void main(String[] args) {
        double valorCompra = 250.0;

        if (valorCompra >= 200) {
            double valorComDesconto = valorCompra - (valorCompra * 0.10);
            System.out.println("Valor final: " + valorComDesconto);
        } else {
            System.out.println("Valor original: " + valorCompra);
        }
    }
}
