package qst6;

import java.util.Scanner;

public class Main {
    /* 6. Desenvolva um algoritmo em Java que receba via construtor um número inteiro
     e imprima o seu antecessor e seu sucessor. */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe-nos um número inteiro, e vos darei seu antecessor e sucessor!");
        int num = leitor.nextInt();
        AntSuc antsuc = new AntSuc(num);
        System.out.println("Antecessor: " + antsuc.ant + " - Sucessor: " + antsuc.suc);
    }
}
