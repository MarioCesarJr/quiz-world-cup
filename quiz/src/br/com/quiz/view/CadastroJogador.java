package br.com.quiz.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroJogador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroJogador frame = new CadastroJogador();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  
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
	public CadastroJogador() {
		setTitle("Cadastro de Jogador");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel();
		lblNome.setIcon(new ImageIcon("C:\\Users\\junior\\git\\Quiz-worldcup\\Quiz-copa\\img\\fussballSmall.png"));
		lblNome.setBounds(10, 0, 302, 276);
		contentPane.add(lblNome);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(266, 46, 61, 14);
		contentPane.add(lblNome_1);
		
		textNome = new JTextField();
		textNome.setBounds(337, 43, 215, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rdbtnFacl = new JRadioButton("fac\u00EDl");
		rdbtnFacl.setBounds(337, 88, 109, 23);
		contentPane.add(rdbtnFacl);
		bg.add(rdbtnFacl);
		
		JRadioButton rdbtnMedio = new JRadioButton("Medio");
		rdbtnMedio.setBounds(337, 130, 109, 23);
		contentPane.add(rdbtnMedio);
		bg.add(rdbtnMedio);
		
		JRadioButton rdbtnDifcil = new JRadioButton("Dif\u00EDcil");
		rdbtnDifcil.setBounds(337, 176, 109, 23);
		contentPane.add(rdbtnDifcil);
		bg.add(rdbtnDifcil);
		
		JButton btnIniciarQuiz = new JButton("Iniciar Quiz");
		btnIniciarQuiz.setIcon(new ImageIcon("C:\\Users\\junior\\git\\Quiz-worldcup\\Quiz-copa\\img\\add1-16.png"));
		btnIniciarQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/**Jogador jog = new Jogador();
				JogadorDao dao = new JogadorDao();
				
				jog.setNome(textNome.getText());
				dao.gravarJogador(jog);*/
				
				TelaPerguntas frame = new TelaPerguntas();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnIniciarQuiz.setBounds(322, 230, 124, 23);
		contentPane.add(btnIniciarQuiz);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\junior\\git\\Quiz-worldcup\\Quiz-copa\\img\\back16.png"));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaPrincipal().setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setBounds(463, 230, 89, 23);
		contentPane.add(btnVoltar);
	}
}
