public class RelatorioVisitor implements AuditoriaVisitor {

    public String exibir(EntidadeSocioeducativa entidade){
        return entidade.aceitar(this);
    }

    @Override
    public String exibirAdolescente(Adolescente adolescente){
        return "Adolescente{" +
                "prontuario=" + adolescente.getProntuario() +
                ", nome='" + adolescente.getNome() + '\'' +
                ", ala=" + adolescente.getNomeAla() +
                '}';
    }

    @Override
    public String exibirAgenteSocioeducativo(AgenteSocioeducativo agente){
        return "AgenteSocioeducativo{" +
                "registroFuncional=" + agente.getRegistroFuncional() +
                ", nome='" + agente.getNome() + '\'' +
                ", escala='" + agente.getEscala() + '\'' +
                '}';
    }

    @Override
    public String exibirVisitanteFamiliar(VisitanteFamiliar visitante){
        return "VisitanteFamiliar{" +
                "codigoAcesso=" + visitante.getCodigoAcesso() +
                ", nome='" + visitante.getNome() + '\'' +
                ", parentesco='" + visitante.getParentesco() + '\'' +
                '}';
    }
}
