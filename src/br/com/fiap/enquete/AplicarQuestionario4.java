package br.com.fiap.enquete;

import javax.swing.*;

public class AplicarQuestionario4 {
    public static void main(String[] args) {
        Questionario enquete = new Questionario("PESSOAL");

        Questao[] questoes = enquete.getQuestoes();


        for (int i = 0; i < questoes.length; i++) {
            Questao questao = questoes[i];
            String resp = fazPergunta(questao.getPergunta());
            exibeResposta(questao.getLabel(), resp);
            questao.setResposta(resp);
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
