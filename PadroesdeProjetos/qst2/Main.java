 package qst2;

public class Main {

    /* Qst 2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
    A média dos números 4, 5 e 6. A soma das duas médias. A média das médias. */

    public static void main(String[] args) {

        // Primeiro Conjunto
        int VIII = 8;
        int IX = 9;
        int VII = 7;

        // Segundo Conjunto
        int IV = 4;
        int V = 5;
        int VI = 6;

        // Média do Primeiro Conjunto
        int sumI = VIII + IX + VII;
        int mediumI = sumI / 3;

        // Média do Ssegundo Conjunto
        int sumII = IV + V + VI;
        int mediumII = sumII / 3;

        // Soma e Média de Médias
        int sumMedium = mediumI + mediumII;
        int mMedium = sumMedium / 2;

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||          Aqui está um algoritmo simples!            ||");
        System.out.println("||   A média aritmética do conjunto I (8, 9, 7) é: " + mediumI + "   ||");
        System.out.println("||  A média aritmética dos conjunto II (4, 5, 6) é: " + mediumII + "  ||");
        System.out.println("||        A soma de ambas médias acima é de: " + sumMedium + "        ||");
        System.out.println("||      A média aritmética das médias acima é e: " + mMedium + "     ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}
