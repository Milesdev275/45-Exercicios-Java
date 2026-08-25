package flamingo.exercicios.estruturascondicionais;

public class Execicios030 {
    static void main(String[] args) {
        int tipoCliente = 3;
        double valorCompra = 200.0;
        double desconto = 0.0;

        if (tipoCliente == 1) {
            desconto = 0.0;
        } else if (tipoCliente == 2) {
            desconto = 0.05;
        } else if (tipoCliente == 3) {
            desconto = 0.10;
        } else if (tipoCliente == 4) {
            desconto = 0.15;
        }

    }
}
