package Hierarquia;

public class Quadrupede extends Animal{
    public int idade;
    public Quadrupede(String nome, String familia, int idade){
        super(nome, familia);
        this.idade=idade;
    }

    public void comerRacao(String racao){
        super.comer();
    }
}
