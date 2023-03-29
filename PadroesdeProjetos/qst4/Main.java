package qst4;

import java.util.Scanner;

public class Main {
    /* 4. Escrever um algoritmo que receba via construtor:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor 1 * quant 1 + valor 2 * quant 2) * (IPI/100 + 1) */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá! Nós vos ajudaremos em sua compra.");
        System.out.println("Primeiramente, digite a porcentagem do IPI a ser acrescido ao valor das peças:\n ");
        double ipi = leitor.nextDouble();

        System.out.println("Agora nós informe os dados do primeiro produto.");
        System.out.println("Nos informe o código do primeiro produto: ");
        int codI = leitor.nextInt();
        System.out.println("Nos informe o valor do primeiro produto: ");
        double valI = leitor.nextDouble();
        System.out.println("Nos informe a quantidade do primeiro produto: ");
        int qntI = leitor.nextInt();

        System.out.println("Agora nós informe os dados do segundo produto.");
        System.out.println("Nos informe o código do segundo produto: ");
        int codII = leitor.nextInt();
        System.out.println("Nos informe o valor do segundo produto: ");
        double valII = leitor.nextDouble();
        System.out.println("Nos informe a quantidade do segundo produto: ");
        int qntII = leitor.nextInt();

        CalcIPI calcIPI = new CalcIPI(ipi, codI, valI, qntI, codII, valII, qntII);
        System.out.println("O total da compra dos produtos " + codI + " e " + codII + " tem quantia total, com acrescimo" +
                " de IPI, de: " + "R$" + calcIPI.totAll );
    }
}
