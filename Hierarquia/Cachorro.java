package Hierarquia;

public class Cachorro extends Quadrupede {
    public Cachorro(String nome, String familia, int idade){
        super(nome, familia, idade);
    }

    public void comerRacao(String racao){
        super.comer();
    };
}
