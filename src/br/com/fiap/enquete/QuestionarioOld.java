package br.com.fiap.enquete;

public class QuestionarioOld {
    private String[] perguntas;

    private String[] rotulos;

    private String[] respostas;

    public QuestionarioOld(String tipo) {
        if (tipo.equals("PESSOAL")) {
            perguntas = new String[] {"Qual é o seu nome? ", "Idade? ", "Quais são seus hobbies? "};
            rotulos = new String[] {"Nome", "Idade", "Hobbies"};
            respostas = new String[3];
        } else if (tipo.equals("ACADEMICO")) {
            perguntas = new String[] {"Que curso voce esta fazendo? " , "Qual periodo voce estuda?"};
            rotulos = new String[] {"Curso", "Periodo"};
            respostas = new String[2];
        }
    }

    public String[] getPerguntas() {
        return perguntas;
    }

    public String[] getRotulos() {
        return rotulos;
    }

    public void setRespostas(String[] resp) {
        this.respostas = resp;
    }

    public int getTamanhoQuestionario() {
        return perguntas.length;
    }
}
