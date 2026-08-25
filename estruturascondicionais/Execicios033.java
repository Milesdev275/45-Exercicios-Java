package flamingo.exercicios.estruturascondicionais;

public class Execicios033 {
    public static void main(String[] args) {
        double saldo = 500.0;
        double valorProduto = 350.0;

        String resultado = (saldo >= valorProduto) ? "Compra aprovada" : "Saldo insuficiente";

        System.out.println(resultado);
    }
}
