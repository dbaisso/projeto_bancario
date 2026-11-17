public class Caneca {
    public String marca;
    public String cor;
    public String alca;
    public int qtdLiquido;
    public boolean tampa;
    public boolean vacuo_parede_dupla;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAlca() {
        return alca;
    }

    public void setAlca(String alca) {
        this.alca = alca;
    }

    public int getQtdLiquido() {
        return qtdLiquido;
    }

    public void setQtdLiquido(int qtdLiquido) {
        this.qtdLiquido = qtdLiquido;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public boolean isVacuo_parede_dupla() {
        return vacuo_parede_dupla;
    }

    public void setVacuo_parede_dupla(boolean vacuo_parede_dupla) {
        this.vacuo_parede_dupla = vacuo_parede_dupla;
    }

    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Com alça: " + this.alca);
        System.out.println("Quantidade de líquido: " + this.qtdLiquido + " ml");
        System.out.println("Possui tampa: " + this.tampa);
        System.out.println("Possui vácuo e parede dupla: " + this.vacuo_parede_dupla);

    }
    public void Tampar(){
        if (this.tampa) {
            System.out.println("A caneca possui tampa e está fechada.");
        } else {
            System.out.println("A caneca não possui tampa.");
        }
    }
    public void VerificarVacuo(){
        if (this.vacuo_parede_dupla) {
            System.out.println("A caneca possui parede dupla e vácuo.");
        } else {
            System.out.println("A caneca não possui parede dupla e vácuo.");
        }
    }

}
