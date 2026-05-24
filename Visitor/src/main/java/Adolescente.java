

public class Adolescente implements EntidadeSocioeducativa{

    private int prontuario;
    private String nome;
    private Ala ala;

    public Adolescente(int prontuario, String nome, Ala alto){
        this.prontuario = prontuario;
        this.nome = nome;
        this.ala = alto;
    }

    public int getProntuario(){
        return prontuario;
    }

    public String getNome(){
        return nome;
    }

    public String getNomeAla(){
        return this.ala.getNome();

    }

    public String aceitar (AuditoriaVisitor visitor){
        return visitor.exibirAdolescente(this);
    }

}
