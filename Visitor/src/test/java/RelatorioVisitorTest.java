import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioVisitorTest {
    @Test
    @DisplayName("Deve exibir o relatório formatado do Adolescente")
    void deveExibirRelatorioAdolescente(){
        Ala ala = new Ala("Ala A - Internação Provisória");
        Adolescente adolescente = new Adolescente(101, "João", ala);
        RelatorioVisitor visitor = new RelatorioVisitor();
        String resultadoEsperado = "Adolescente{prontuario=101, nome='João', ala=Ala A - Internação Provisória}";

        String resultadoObtido = visitor.exibir(adolescente);

        assertEquals(resultadoEsperado, resultadoObtido, "O relatório do adolescente está incorreto.");

    }

    @Test
    @DisplayName("Deve exibir o relatório formatado do Agente Socioeducativo")
    void deveExibirRelatorioAgenteSocioeducativo(){
        AgenteSocioeducativo agente = new AgenteSocioeducativo(2002, "Josias", "Plantão Noturno 12x36");
        RelatorioVisitor visitor = new RelatorioVisitor();
        String resultadoEsperado = "AgenteSocioeducativo{registroFuncional=2002, nome='Josias', escala='Plantão Noturno 12x36'}";

        String resultadoObtido = visitor.exibir(agente);

        assertEquals(resultadoEsperado, resultadoObtido, "O relatório do agente socioeducativo está incorreto.");
    }

    @Test
    @DisplayName("Deve exibir o relatório formatado do Visitante Familiar")
    void deveExibirRelatorioVisitanteFamiliar(){
        VisitanteFamiliar visitante = new VisitanteFamiliar(505, "Maria", "Esposa");
        RelatorioVisitor visitor = new RelatorioVisitor();
        String resultadoEsperado = "VisitanteFamiliar{codigoAcesso=505, nome='Maria', parentesco='Esposa'}";

        String resultadoObtido = visitor.exibir(visitante);

        assertEquals(resultadoEsperado, resultadoObtido, "O relatório do visitante familiar está incorreto.");
    }
}
