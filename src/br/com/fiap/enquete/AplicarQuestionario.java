package br.com.fiap.enquete;

import javax.swing.*;

public class AplicarQuestionario {
    public static void main(String[] args) {
        String nome = fazPergunta("Qual é o seu nome? ");

        JOptionPane.showMessageDialog(null, "Nome: " + nome);

        String idade = fazPergunta("Idade? ");
        JOptionPane.showMessageDialog(null, "Idade: " + idade);

        String hobbies = fazPergunta("Quais são seus hobbies? ");
        JOptionPane.showMessageDialog(null, "Hobbies: " + hobbies);
    }

    public static String fazPergunta(String s) {
        String resp = JOptionPane.showInputDialog(s);
        return resp;
    }
}
