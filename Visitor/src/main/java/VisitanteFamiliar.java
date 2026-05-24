public class VisitanteFamiliar implements EntidadeSocioeducativa{

    private int codigoAcesso;
    private String nome;
    private String parentesco;

    public VisitanteFamiliar(int codigoAcesso, String nome, String parentesco){
        this.codigoAcesso = codigoAcesso;
        this.nome = nome;
        this.parentesco = parentesco;
    }

    public int getCodigoAcesso(){
        return codigoAcesso;
    }

    public String getNome(){
        return nome;
    }

    public String getParentesco(){
        return parentesco;
    }

    public String aceitar(AuditoriaVisitor visitor){
        return visitor.exibirVisitanteFamiliar(this);
    }
}
