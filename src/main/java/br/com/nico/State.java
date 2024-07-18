package br.com.nico;
//aqui estou restringindo os textos que eu posso botar na variavel state para nao gerar erros, por isso usamos o public class enum
public enum State {
    TO_DO("A faxer", "Hacer"),
    DOING("Fazendo", "Haciendo"),
    DONE("Feito", "Hecho");

    //criando valores para traduzir esse enum
    private final String ptName;
    private final String esName;

    State(String ptName, String esName) {
        this.ptName = ptName;
        this.esName = esName;
    }

    public String getPtName() {
        return ptName;
    }

    public String getEsName() {
        return esName;
    }
}
