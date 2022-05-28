import org.json.*;

public class ArquivoAdapter extends Json {
    private IArquivo arquivoXml;


    public ArquivoAdapter(IArquivo arquivo) {
        this.arquivoXml = arquivo;
    }

    public void converterArquivo(){
        JSONObject json = XML.toJSONObject(arquivoXml.getArquivo());
        this.setArquivo(json.toString());
    }
    public String obterArquivo(){



        return XML.toString(new JSONObject(this.getArquivo()));
    }
}
