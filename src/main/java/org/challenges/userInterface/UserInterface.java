package org.challenges.userInterface;

import org.challenges.challengesString.*;

import javax.swing.*;
import java.awt.*;


public class UserInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface do Usuário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        JLabel label = new JLabel("Digite o texto:");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);

        JTextField textField = new JTextField(20);
        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, textField.getPreferredSize().height));
        panel.add(textField);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton reverseButton = new JButton("Inverter Palavras");
        reverseButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        reverseButton.setMaximumSize(new Dimension(300, 50));
        reverseButton.setBackground(new Color(255, 204, 204));
        reverseButton.addActionListener(e -> {

            try {
                JOptionPane.showMessageDialog(frame, ReversePhrase.reversePhrase(textField.getText()));
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }


        });
        panel.add(reverseButton);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton removeDuplicatesButton = new JButton("Remover Duplicatas");
        removeDuplicatesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        removeDuplicatesButton.setMaximumSize(new Dimension(300, 50));
        removeDuplicatesButton.setBackground(new Color(204, 255, 204));

        removeDuplicatesButton.addActionListener(e -> {

            try {

            JOptionPane.showMessageDialog(frame, RemoveDuplicatesChars.duplicateRemover(textField.getText()));}
            catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(frame,ex.getMessage());}

        });
        panel.add(removeDuplicatesButton);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton palindromeButton = new JButton("Encontrar Palíndromo");
        palindromeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        palindromeButton.setMaximumSize(new Dimension(300, 50));
        palindromeButton.setBackground(new Color(204, 204, 255));

        palindromeButton.addActionListener(e -> {

            try{
            JOptionPane.showMessageDialog(frame, Palindrome.getPalindrome(textField.getText()));}
            catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(frame, ex.getMessage());}
        });


        panel.add(palindromeButton);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton uppercaseButton = new JButton("Primeira Letra Maiúscula");
        uppercaseButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        uppercaseButton.setMaximumSize(new Dimension(300, 50));
        uppercaseButton.setBackground(new Color(255, 255, 204));

        uppercaseButton.addActionListener(e -> {
            try {
                JOptionPane.showMessageDialog(frame, UppercaseLetter.upperCaseFirstLetter(textField.getText()));
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(frame,ex.getMessage());

            }

        });
        panel.add(uppercaseButton);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton anagramPalindromeButton = new JButton("É Anagrama de Palíndromo?");
        anagramPalindromeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        anagramPalindromeButton.setMaximumSize(new Dimension(300, 50));
        anagramPalindromeButton.setBackground(new Color(204, 255, 255));

        anagramPalindromeButton.addActionListener(e -> {

            try {

                JOptionPane.showMessageDialog(frame, PalindromeAnagram.isAnagramOfPalindrome(textField.getText()) ? "True" : "False");

            }catch (IllegalArgumentException ex){

                JOptionPane.showMessageDialog(frame, ex.getMessage());

            }

        });
        panel.add(anagramPalindromeButton);

        frame.setVisible(true);
    }
}
