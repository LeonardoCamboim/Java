package qst3;

import java.util.Scanner;

// Qst 3. Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe-nos vosso saldo por favor: ");
        float saldo = leitor.nextFloat();
        float saldoAjuste = (float) (saldo * 0.01) + saldo;
        System.out.println("Seu saldo com ajuste é de: " + saldoAjuste);
    }
}
