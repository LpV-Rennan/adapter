public class Relatorio {
    IArquivo xml;
    ArquivoAdapter adaptador;

    public Relatorio() {
        this.xml = new Xml();
        this.adaptador = new ArquivoAdapter(this.xml);
    }

    public void setXml(String xmlContent){
        xml.setArquivo(xmlContent);
        adaptador.converterArquivo();
    }

    public String obterArquivo() {
        return adaptador.obterArquivo();
    }

    public String obterJson(){
        return adaptador.getArquivo();
    }
}
