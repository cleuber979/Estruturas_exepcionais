public class caixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 35.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Olá tudo bem? Seu saldo após valor solicitado e R$ " + saldo);
        } else if (valorSolicitado > saldo)
            System.out.println("Lamentamos mais o valor solicitado e maior do que o valor em conta");
    }

}
