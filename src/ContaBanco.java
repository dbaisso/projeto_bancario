public class ContaBanco {

    private String numConta;
    protected String tipo;
    public double dono;
    public double saldo;
    public String status;

    public ContaBanco(String numConta, String tipo, double dono, double saldo, String status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDono() {
        return dono;
    }

    public void setDono(double dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void abrirConta() {
        if (this.tipo.equals("CC")) {
            this.saldo = 50;
        } else if (this.tipo.equals("CP")) {
            this.saldo = 150;
        }
        this.status = "aberta";
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro, não posso fechá-la");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito, não posso fechá-la");
        } else {
            this.status = "fechada";
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(double valor) {
         if (this.status.equals("aberta")) {
             this.saldo += valor;
             System.out.println("Depósito realizado na conta de " + this.dono);
         } else {
             System.out.println("Impossível depositar em uma conta fechada");
         }
        }
    public void sacar ( double valor) {
            if (this.status.equals("aberta")) {
                if (this.saldo >= valor) {
                    this.saldo -= valor;
                    System.out.println("Saque realizado na conta de " + this.dono);
                } else {
                    System.out.println("Saldo insuficiente para saque");
                }
            } else {
                System.out.println("Impossível sacar de uma conta fechada");
            }
        }
    public void pagarMensal (){
                 int valor = 0;
                 if (this.tipo.equals("CC")) {
                     valor = 12;
                 } else if (this.tipo.equals("CP")) {
                     valor = 20;
                 }
                 if (this.status.equals("aberta")) {
                     this.saldo -= valor;
                     System.out.println("Mensalidade paga com sucesso por " + this.dono);
                 } else {
                     System.out.println("Impossível pagar uma conta fechada");
                 }
             }
}

