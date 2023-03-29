package qst1;

public class CalcDias {
int anoDisp;
int mesDisp;
int diaDisp;

    public CalcDias(int ano, int mes, int dia) {
        anoDisp = ano * 365;
        mesDisp = mes * 30;
        diaDisp = anoDisp + mesDisp + dia;
    }
}
