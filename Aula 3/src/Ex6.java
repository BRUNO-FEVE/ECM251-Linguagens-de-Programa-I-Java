

public class Ex6 {
            /* 6. Crie um algoritmo que calcule o valor de uma dívida, submetida à juros compostos:
        ValorFinal = ValorInicial * (1 + J / 100) ^ N
        E seja capaz de responder, se você deve para o cartão de crédito R$ 100,00, a uma taxa de juros de 10%, quanto deverá ser pago depois de 8 meses.
        Onde:
        • J representa os juros (em %); e
        • N representa o número de meses. */
    public static void main(String[] args) throws Exception {
        double j = 10;  // juros em porcentagem
        double n = 8;   // número de meses
        double valorInicial = 100;

        double valorFinal = Math.round((valorInicial * Math.pow(1+j/100, n)));

        System.out.println("Valor a ser a pago: " + valorFinal + " reais.");
    }
}
