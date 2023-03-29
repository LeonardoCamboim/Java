package qst1;

import java.util.Scanner;
public class Main {

    /* Qst 1. Faça um algoritmo que receba via constutor a idade de uma
    pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
    Obs.: Leve em consideração o ano com 365 dias e o mês com 30
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos calcular quantos dias de idade você tem!");
        System.out.println("Lembre-se! Aqui contaremos anos como tendo 365 dias e meses como tendo 30 dias!\n");
        System.out.println("Digite quantos anos você têm:");
        int ano = leitor.nextInt();
        System.out.println("E quantos meses dentro deste ano?");
        int mes = leitor.nextInt();
        System.out.println("E quanto dias dentro deste ano?");
        int dia = leitor.nextInt();

        CalcDias dias = new CalcDias(ano, mes, dia);
        System.out.println("Você tem " + dias.diaDisp + " dias de idade!");
    }
}