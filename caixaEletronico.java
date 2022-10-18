public class caixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 15.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println("Olá tudo bem? Seu saldo após valor solicitado e R$ " + saldo);

    }

}
