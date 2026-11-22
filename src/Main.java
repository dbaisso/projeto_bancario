public class Main {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta("1234-5");
        conta1.setTipo("CC");
        conta1.setDono("João"); 
        conta1.abrirConta();
        conta1.depositar(500);
        conta1.sacar(100);

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta("6789-0");
        conta2.setTipo("CP");
        conta2.setDono("Maria");
        conta2.abrirConta(); 
        conta2.depositar(1000);   
        conta2.sacar(200);
        

        System.out.println("------------------------------------------");
        System.out.println("Resumo: \nConta: " + conta1.getNumConta()
                + ", \nTipo: " + conta1.getTipo()
                + ", \nTitular: " + conta1.getDono()
                + ", \nSaldo R$ " + conta1.getSaldo()
                + ", \nStatus: " + conta1.getStatus() + ".");
                
        System.out.println("------------------------------------------");
        System.out.println("Resumo: \nConta: " + conta2.getNumConta()
                + ", \nTipo: " + conta2.getTipo()
                + ", \nTitular: " + conta2.getDono()
                + ", \nSaldo R$ " + conta2.getSaldo()
                + ", \nStatus: " + conta2.getStatus() + ".");
    }
}
