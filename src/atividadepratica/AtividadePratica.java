/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepratica;

import javax.swing.*;

/**
 * @author alexf
 */
public class AtividadePratica {

    public static void main(String args[]) {

        int VetSoma[], i, soma = 0, media;

        VetSoma = new int[50];

        for (i = 0; i <= 49; i++) {

            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

            soma = soma + VetSoma[i];

        }

        media = soma / 50;

        System.out.println("A média das 50 notas digitadas eh: " + media);

        System.exit(0);

    }

}
