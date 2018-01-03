package Hierarquia;

public class Preguica extends Animal{
    private String cor;

    public Preguica(String nome, String familia){
        super(nome, familia);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void subirArvore(){}
}