public class FichaAuditoriaVisitor implements AuditoriaVisitor{

    public String auditar(EntidadeSocioeducativa entidade){
        return entidade.aceitar(this);
    }

    @Override
    public String exibirAdolescente(Adolescente adolescente){
        return "AUDITORIA | Tipo: ADOLESCENTE" +
                " | Prontuario: " + adolescente.getProntuario() +
                " | Nome: " + adolescente.getNome() +
                " | Ala: " + adolescente.getNomeAla() +
                " | Status: INTERNADO";
    }

    @Override
    public String exibirAgenteSocioeducativo(AgenteSocioeducativo agente){
        return "AUDITORIA | Tipo: AGENTE" +
                " | Registro: " + agente.getRegistroFuncional() +
                " | Nome: " + agente.getNome() +
                " | Escala: " + agente.getEscala() +
                " | Status: ATIVO";
    }

    @Override
    public String exibirVisitanteFamiliar(VisitanteFamiliar visitante){
        return "AUDITORIA | Tipo: VISITANTE" +
                " | Código Acesso: " + visitante.getCodigoAcesso() +
                " | Nome: " + visitante.getNome() +
                " | Parentesco: " + visitante.getParentesco() +
                " | Status: AUTORIZADO";
    }
}
