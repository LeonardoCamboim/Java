package qst5;

public class CalcSal {
    /* 5. Crie um algoritmo que receba via construtor o valor do salário mínimo
     e o valor do salário de um usuário, calcule a quantidade de salários mínimos
     esse usuário ganha e imprima o resultado.
     (1SM=R$1320,00) */
    float salMin = (float) 1320.00;

    float quantSal;

    public CalcSal (float salUsr) {
        quantSal = salUsr / salMin;
    }
}
