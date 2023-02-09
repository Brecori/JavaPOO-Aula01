package br.com.fiap.enquete;

import javax.swing.*;

public class AplicarQuestionario3 {
    public static void main(String[] args) {
        QuestionarioOld enquete = new QuestionarioOld("ACADEMICO");

        String[] perguntas = enquete.getPerguntas();
        String[] labels = enquete.getRotulos();
        int qtd = enquete.getTamanhoQuestionario();
        String[] resp = new String[qtd];


        for (int i = 0; i < labels.length; i++) {
            resp[i] = fazPergunta(perguntas[i]);
            exibeResposta(labels[i], resp[i]);
        }


    }

    public static void exibeResposta(String rotulo, String resposta) {
        JOptionPane.showMessageDialog(null, rotulo + ": " + resposta);
    }

    public static String fazPergunta(String s) {
        String resp = JOptionPane.showInputDialog(s);
        return resp;
    }
}
