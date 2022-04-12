package aula3;

public class Aula3 {
    public static void main(String args[]) {
        int n1, n2;
        n1 = 6;
        n2 = 9;
        boolean operadoreslogicos;
        operadoreslogicos = (n1 < n2 || n1 + n2 == n2 - n1) ? true : false;
        System.out.println(operadoreslogicos);
        String exemplificadosoperadores;
        exemplificadosoperadores = "||(ou), ^(ou exclusivo), &&(e), ==(igual a), !=(diferente de), !(não)";
        String lembrete;
        lembrete = "strings podem ter o mesmo obj mas são diferentes entre si, apenas os conteudo é igual";
        System.out.println(exemplificadosoperadores + lembrete);
    }

}
