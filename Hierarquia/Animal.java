package Hierarquia;

/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
Comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
Características de forma que tudo o que for comum a todos os animais fiquem na classe

Animal
Cachorro(nome, familia, andar, comer, comer(ração), idade,respira)
Cavalo(nome, familia, andar, comer, comer(ração), idade, respira)
Preguiça(nome, familia, subirArvore, comer, andar, cor, respira)

Implemente um programa que crie os 3 tipos de animais definidos nos construtores das classes filhas(subclasses),
e invoque cada um dos métodos criados para cada animal. Respirar é um método que não deve permitir herança.
*/

public class Animal {
    public String nome;
    public String familia;

    public Animal(String nome, String familia){
        this.nome=nome;
        this.familia=familia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    private void respirar(){
        System.out.println("Respirar");
    }

    public void respirar(int folego){
        System.out.println("Respirada "+folego);
    }

    public void andar(){}

    public void comer(){}
}