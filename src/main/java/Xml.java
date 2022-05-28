public class Xml implements IArquivo {
    private String arquivo;
    @Override
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public String getArquivo() {
        return this.arquivo;
    }
}
