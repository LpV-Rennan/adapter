import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RelatorioTest {
    @Test
     void deveRetornarConceitoAluno() {
        Relatorio aluno = new Relatorio();
        aluno.setXml("<root><test       attribute=\"text1\">javatpoint</test><test attribute=\"text2\">JTP</test></root>");
        assertEquals("<root><test><attribute>text1</attribute>javatpoint</test><test><attribute>text2</attribute>JTP</test></root>", aluno.obterArquivo());
    }
    @Test
    void deveRetornarConceitoA() {
        Relatorio aluno = new Relatorio();
        aluno.setXml("<root><test       attribute=\"text1\">javatpoint</test><test attribute=\"text2\">JTP</test></root>");

        assertEquals("{\"root\":{\"test\":[{\"attribute\":\"text1\",\"content\":\"javatpoint\"},{\"attribute\":\"text2\",\"content\":\"JTP\"}]}}", aluno.obterJson());
    }


}