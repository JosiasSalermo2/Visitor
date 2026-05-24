public class AgenteSocioeducativo implements EntidadeSocioeducativa{

    private int registroFuncional;
    private String nome;
    private String escala;

    public AgenteSocioeducativo(int registroFuncional, String nome, String escala){
        this.registroFuncional = registroFuncional;
        this.nome = nome;
        this.escala = escala;
    }

    public int getRegistroFuncional(){
        return registroFuncional;
    }

    public String getNome(){
        return nome;
    }

    public String getEscala(){
        return escala;
    }

    public String aceitar(AuditoriaVisitor visitor){
        return visitor.exibirAgenteSocioeducativo(this);
    }



}
