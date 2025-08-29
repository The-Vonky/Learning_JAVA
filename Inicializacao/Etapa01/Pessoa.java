public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){
        this("",0);
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}