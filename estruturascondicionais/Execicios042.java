package flamingo.exercicios.estruturascondicionais;

public class Execicios042 {
    public static void main(String[] args) {
        double saldo = 100.0;
        double valorProduto = 300.0;
        boolean clienteVip = true;

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada");
        } else if (clienteVip) {
            System.out.println("Compra aprovada pelo crédito VIP");
        } else {
            System.out.println("Compra recusada");
        }
    }
}
