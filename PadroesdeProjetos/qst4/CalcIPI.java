package qst4;

public class CalcIPI {

    /* 4. Escrever um algoritmo que receba via construtor:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor 1 * quant 1 + valor 2 * quant 2) * (IPI/100 + 1) */

    double tot1;
    double tot2;
    double totAll;

    public CalcIPI(double porcIPI,
                   int codP1, double valour1, int quant1,
                   int codP2, double valour2, int quant2) {
        tot1 = valour1 * quant1;
        tot2 = valour2 * quant2;
        totAll = (porcIPI / 100 + 1) * (tot1 + tot2);
    }
}
