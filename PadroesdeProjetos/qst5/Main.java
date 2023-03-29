package qst5;

import java.util.Scanner;

public class Main {
    /* 5. Crie um algoritmo que receba via construtor o valor do salário mínimo
     e o valor do salário de um usuário, calcule a quantidade de salários mínimos
     esse usuário ganha e imprima o resultado.
     (1SM=R$1320,00) */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva aqui a quantia de seu salário, e informaremos quantos salários mínimos você recebe:");
        float salUsr = leitor.nextFloat();
        CalcSal calcSal = new CalcSal(salUsr);
        System.out.println("Você recebe " + calcSal.quantSal + " salários mínimos");
    }
}
