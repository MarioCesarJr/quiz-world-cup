package br.com.quiz.view;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

import br.com.quiz.controller.Quiz;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TelaOpcao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JRadioButton rdbtnFcil;
	JRadioButton rdbtnMedio;
	JRadioButton rdbtnDifcil;
	static int nivel;
	Quiz jogo = new Quiz();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOpcao frame = new TelaOpcao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaOpcao() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/football_128x128.png"));
		setTitle("Op\u00E7\u00F5es");
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDficuldade = new JLabel("Dificuldade");
		lblDficuldade.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDficuldade.setBounds(10, 26, 104, 14);
		contentPane.add(lblDficuldade);

		ButtonGroup bg = new ButtonGroup();

		rdbtnFcil = new JRadioButton("F\u00E1cil");
		rdbtnFcil.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFcil.setToolTipText("Sua pontua��o multiplicar� o tempo por 5");
		rdbtnFcil.setBounds(120, 23, 109, 23);
		contentPane.add(rdbtnFcil);
		bg.add(rdbtnFcil);

		rdbtnMedio = new JRadioButton("M\u00E9dio");
		rdbtnMedio.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnMedio.setToolTipText("Sua pontua��o multiplicar� o tempo por 7");
		rdbtnMedio.setBounds(120, 67, 109, 23);
		contentPane.add(rdbtnMedio);
		bg.add(rdbtnMedio);

		rdbtnDifcil = new JRadioButton("Dif\u00EDcil");
		rdbtnDifcil.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnDifcil.setToolTipText("Sua pontua��o multiplicar� o tempo por 9");
		rdbtnDifcil.setBounds(120, 112, 109, 23);
		contentPane.add(rdbtnDifcil);
		bg.add(rdbtnDifcil);

		JButton btnCadastrarPerguntas = new JButton("Cadastrar Perguntas");
		btnCadastrarPerguntas.setBackground(SystemColor.menu);
		btnCadastrarPerguntas.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarPerguntas.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String senha = "123";

				// Criar a mensagem sera exibida
			JLabel label = new JLabel("Digite a senha:");
				// criar o componente grafico que recebera o que for digitado
			JPasswordField jpf = new JPasswordField();
				// Exibir a janela para o usuario
			JOptionPane.showConfirmDialog(null, new Object[] { label, jpf },"Senha:", JOptionPane.OK_CANCEL_OPTION,
								JOptionPane.PLAIN_MESSAGE);

				// Pegamos o que foi digitado e comparamos com a senha correta
				String senhaDigitada = new String(jpf.getPassword());
				if (senha.equals(senhaDigitada)){
					  CadastroPerguntas cp = new CadastroPerguntas();
					  cp.setLocationRelativeTo(null);
					  cp.setVisible(true);
				      dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Senha Incorreta");
				}
			}

		});
		btnCadastrarPerguntas.setBounds(10, 230, 196, 42);
		contentPane.add(btnCadastrarPerguntas);

		JButton btnVoltar = new JButton("Confirmar n�vel");
		btnVoltar.setBackground(SystemColor.menu);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				// jogo � uma instancia da Classe Quiz do pacote controller.
				if (rdbtnFcil.isSelected()) {
					jogo.setNivel(1);
				} else if (rdbtnMedio.isSelected()) {
					jogo.setNivel(2);
				} else if (rdbtnDifcil.isSelected()) {
					jogo.setNivel(3);
				} else {
					nivel = 2;
				}

				//new TelaPrincipal().setVisible(true);
				setVisible(false);
			}
		});
		//btnVoltar.setIcon(new ImageIcon("img/back16.png"));
		btnVoltar.setBounds(20, 162, 168, 44);
		contentPane.add(btnVoltar);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("img/foot_butSmall.png"));
		lblNewLabel.setBounds(233, 11, 230, 294);
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 142, 196, 11);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 217, 196, 2);
		contentPane.add(separator_1);
	}

}
