public class Main {
    public static void main(String[] args) {
        System.out.println("Marina vai abrir uma conta corrente no banco.");

        ContaBanco conta = new ContaBanco("1234", "CC", 1000, 0, "fechada");
        conta.abrirConta();
        System.out.println("Conta " + conta.getNumConta() + " aberta. Saldo inicial: R$ " + conta.getSaldo());

        System.out.println("Marina deposita R$ 100 e depois saca R$ 50.");
        conta.depositar(100);
        conta.sacar(50);

        System.out.println("A mensalidade da conta é descontada.");
        conta.pagarMensal();
        System.out.println("Saldo após as movimentações: R$ " + conta.getSaldo());

        System.out.println("Marina tenta fechar a conta, mas ainda há saldo.");
        conta.fecharConta();

        System.out.println("Ela saca o valor restante e tenta fechar novamente.");
        conta.sacar(conta.getSaldo());
        conta.fecharConta();

        System.out.println("Resumo: conta " + conta.getNumConta()
                + ", tipo " + conta.getTipo()
                + ", titular " + conta.getDono()
                + ", saldo R$ " + conta.getSaldo()
                + ", situação " + conta.getStatus() + ".");
    }
}
