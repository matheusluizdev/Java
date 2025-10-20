package application;

import javax.swing.JOptionPane;

public class Program {

	 public static void main(String[] args) {
	        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
	                "Insira a nota da P1: ", "Nota P1", JOptionPane.QUESTION_MESSAGE));
	        
	        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
	                "Insira a nota da P2: ", "Nota P2", JOptionPane.QUESTION_MESSAGE));
	        
	        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,
	                "Insira a nota dos trabalhos: ", "Nota trabalhos", JOptionPane.QUESTION_MESSAGE));
	        
	        Superior sup = new Superior();        
	        sup.SetNotas(n1, n2, n3);
	        
	        JOptionPane.showMessageDialog(null, "A média do superior é: " + sup.CalculaMedia() + ".",
	                "Media do superior", JOptionPane.INFORMATION_MESSAGE);
	        
	        Tecnico tec = new Tecnico();
	        tec.SetNota(n1, n2, n3);
	        
	        JOptionPane.showMessageDialog(null, "A média do técnico é: " + tec.CalculaMedia() + ".",
	                "Média do superior", JOptionPane.INFORMATION_MESSAGE);
	        
	    }    
	}