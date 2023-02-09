package br.com.fiap.enquete;

public class Questionario {

    private Questao[] questoes;

    public Questionario(String tipo) {
        if (tipo.equals("PESSOAL")) {
            questoes = new Questao[3];

            questoes[0] = new Questao("Qual e o seu nome?", "Nome");
            questoes[1] = new Questao("Idade?", "Idade");
            questoes[2] = new Questao("Quais são seus hobbies?", "Hobbie");

        } else if (tipo.equals("ACADEMICO")) {
            questoes[0] = new Questao("Qual curso você está fazendo?", "Curso");
            questoes[1] = new Questao("Qual período você estuda?", "Período");
        }
    }

    public Questao[] getQuestoes() {
        return questoes;
    };

    public int getTamanhoQuestionario() {
      return questoes.length;
    };

}
