package flamingo.exercicios.estruturascondicionais;

public class Execicios045 {
    public static void main(String[] args) {
        double valorCompra = 350.0;
        double porcentagemDesconto;

        if (valorCompra <= 100) {
            porcentagemDesconto = 0;
        } else if (valorCompra <= 300) {
            porcentagemDesconto = 5;
        } else if (valorCompra <= 500) {
            porcentagemDesconto = 10;
        } else {
            porcentagemDesconto = 15;
        }

        double valorDesconto = valorCompra * (porcentagemDesconto / 100);
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: " + valorCompra);
        System.out.println("Porcentagem de desconto: " + porcentagemDesconto + "%");
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor final da compra: " + valorFinal);
    }
}

// primeiro descobrimos a porcentagem de desconto certa usando várias faixas de if/else if.
// Depois, calculamos o valor do desconto em dinheiro (valorCompra * porcentagemDesconto / 100)
// e subtraímos esse valor do total para chegar no valorFinal.
// Separar o cálculo em passos (porcentagem → valor do desconto → valor final)
// deixa o código mais fácil de entender e de depurar.
