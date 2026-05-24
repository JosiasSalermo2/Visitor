import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FichaAuditoriaVisitorTest {

    @Test
    @DisplayName("Deve gerar a ficha de auditoria do Adolescente com status INTERNADO")
    void deveAuditarAdolescente(){
        Ala ala = new Ala("Ala B - Semiliberdade");
        Adolescente adolescente = new Adolescente(202, "João", ala);
        FichaAuditoriaVisitor visitor = new FichaAuditoriaVisitor();
        String resultadoEsperado = "AUDITORIA | Tipo: ADOLESCENTE | Prontuario: 202 | Nome: João | Ala: Ala B - Semiliberdade | Status: INTERNADO";

        String resultadoObtido = visitor.auditar(adolescente);

        assertEquals(resultadoEsperado, resultadoObtido, "A ficha de auditoria do adolescente está incorreta.");

    }

    @Test
    @DisplayName("Deve gerar a ficha de auditoria do Agente Socioeducativo com status ATIVO")
    void deveAuditarAgenteSocioeducativo(){
        AgenteSocioeducativo agente = new AgenteSocioeducativo(2002, "Josias", "Plantão Noturno 12x36");
        FichaAuditoriaVisitor visitor = new FichaAuditoriaVisitor();
        String resultadoEsperado = "AUDITORIA | Tipo: AGENTE | Registro: 2002 | Nome: Josias | Escala: Plantão Noturno 12x36 | Status: ATIVO";

        String resultadoObtido = visitor.auditar(agente);

        assertEquals(resultadoEsperado, resultadoObtido, "A ficha de auditoria do agente está incorreta.");
    }

    @Test
    @DisplayName("Deve gerar a ficha de auditoria do Visitante Familiar com status VISITA AUTORIZADA")
    void deveAuditarVisitanteFamiliar(){
        VisitanteFamiliar visitante = new VisitanteFamiliar(505, "Maria", "Filha");
        FichaAuditoriaVisitor visitor = new FichaAuditoriaVisitor();
        String resultadoEsperado = "AUDITORIA | Tipo: VISITANTE | Codigo: 505 | Nome: Maria | Parentesco: Filha | Status: VISITA AUTORIZADA";

        String resultadoObtido = visitor.auditar(visitante);

        assertEquals(resultadoEsperado, resultadoObtido, "A ficha de auditoria do visitante familiar está incorreta.");
    }
}
