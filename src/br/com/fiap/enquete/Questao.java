package br.com.fiap.enquete;

public class Questao {

    private String pergunta;

    private String label;

    private String resposta;

    public Questao(String q, String l) {
        pergunta = q;
        label = l;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getLabel() {
        return label;
    }

    public void setResposta(String r) {
        this.resposta = r;
    }
}
