package br.com.fiap.enquete;

import javax.swing.*;

public class AplicarQuestionario2 {
    public static void main(String[] args) {
        String[] perguntas = new String[] {"Qual é o seu nome? ", "Idade? ", "Quais são seus hobbies? "};
        String[] labels = new String[] {"Nome", "Idade", "Hobbies"};

        String resp[] = new String[3];


        for (int i = 0; i < perguntas.length; i++) {
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
