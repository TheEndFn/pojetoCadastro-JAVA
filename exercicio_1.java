package exercicio1;

import javax.swing.*;

public class exercicio_1 {

	public static void main(String[] args) {
		
			// Primeira Janela
			JFrame janela = new JFrame("CADASTRO"); 
			janela.setSize(800, 400); 
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			janela.setLocationRelativeTo(null);
			janela.setLayout(null);  
			
			
			// Textos explicativo
			JLabel texto0 = new JLabel("Digite seu nome de usuário:");
			texto0.setBounds(0, 40, 200, 25);
			
			JLabel texto1 = new JLabel("Digite sua idade:");
			texto1.setBounds(0, 80, 200, 25);
			
			JLabel texto2 = new JLabel("Digite sua profissão:");
			texto2.setBounds(0, 120, 200, 25);
			
			
			// Campo de entrada
			JTextField campoTexto0 = new JTextField();
			campoTexto0.setBounds(160, 40, 200, 25);
			
			JTextField campoTexto1 = new JTextField();
			campoTexto1.setBounds(160, 80, 200, 25);
			
			JTextField campoTexto2 = new JTextField();
			campoTexto2.setBounds(160, 120, 200, 25);
			
			
			
			// Adicionando botões
			JButton botao0 = new JButton("Cadastrar");
			botao0.setBounds(390, 40, 100, 25);
			
			JButton botao00 = new JButton("Limpar");
			botao00.setBounds(500, 40, 100, 25);
			
			JButton botao1 = new JButton("Cadastrar");
			botao1.setBounds(390, 80, 100, 25);
			
			JButton botao01 = new JButton("Limpar");
			botao01.setBounds(500, 80, 100, 25);
			
			JButton botao2 = new JButton("Cadastrar");
			botao2.setBounds(390, 120, 100, 25);
			
			JButton botao02 = new JButton("Limpar");
			botao02.setBounds(500, 120, 100, 25);

			
			
			// Segunda janela
			JFrame janela0 = new JFrame();
			janela0.setSize(400, 200);
			janela0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela0.setLocationRelativeTo(null);
			janela0.setLayout(null);
			janela0.setAlwaysOnTop(true);
			
			
			
			// Esse label será usado para imprimir as informações na segunda janela
			JLabel resposta0 = new JLabel();
			resposta0.setBounds(20, 40, 300, 25);
					
			JLabel resposta1 = new JLabel();
			resposta1.setBounds(20, 80, 300, 25);
					
			JLabel resposta2 = new JLabel();
			resposta2.setBounds(20, 120, 300, 25);
			
			
			
			janela0.add(resposta0);
			janela0.add(resposta1);
			janela0.add(resposta2);
			
			
			
			botao0.addActionListener(e -> {
				String nome = campoTexto0.getText();
				resposta0.setText("Nome do usuário = " + nome);
			});
			
			botao00.addActionListener(e -> {
				resposta0.setText("");
			});
			
			botao1.addActionListener(e -> {
				String idade = campoTexto1.getText();
				resposta1.setText("Idade do usuário = " + idade);
				
			});
			
			botao01.addActionListener(e -> {
				resposta1.setText("");
			});
			
			botao2.addActionListener(e -> {
				String profissao = campoTexto2.getText();
				resposta2.setText("Profissão do usuário = " + profissao);
				janela0.setVisible(true);
			});
			
			botao02.addActionListener(e -> {
				resposta2.setText("");
			});
			
			
			janela.add(texto0);
			janela.add(texto1);
			janela.add(texto2);
			janela.add(campoTexto0);
			janela.add(campoTexto1);
			janela.add(campoTexto2);
			janela.add(botao0);
			janela.add(botao00);
			janela.add(botao1);
			janela.add(botao01);
			janela.add(botao2);
			janela.add(botao02);
			
		
	        
	    janela.setVisible(true); // Torna a janela visível	

		}
}
