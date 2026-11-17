public class Mouse {
    public String nome;
    public String marca;
    public String Modelo;
    public String Cor;
    public boolean comFio;
    public boolean conectado;
    public int botoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public boolean isComFio() {
        return comFio;
    }

    public void setComFio(boolean comFio) {
        this.comFio = comFio;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public int getBotoes() {
        return botoes;
    }

    public void setBotoes(int botoes) {
        this.botoes = botoes;
    }

    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Com fio: " + this.comFio);
        System.out.println("Botões: " + this.botoes);
        System.out.println("Conectado: " + this.conectado);
    }
    public void conectado(){
        if (this.conectado) {
            System.out.println("O mouse está conectado ao computador.");
        } else {
            System.out.println("O mouse não está conectado ao computador.");
        }
    }

}

