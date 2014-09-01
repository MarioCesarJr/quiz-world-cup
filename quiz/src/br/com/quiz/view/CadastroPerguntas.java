package br.com.quiz.view;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import br.com.quiz.dao.PerguntaDao;
import br.com.quiz.model.Pergunta;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class CadastroPerguntas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textQuestao;
	private JTextField textAlternativaA;
	private JTextField textAlternativaB;
	private JTextField textAlternativaC;
	private JTextField textAlternativaD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPerguntas frame = new CadastroPerguntas();
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
	public CadastroPerguntas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/football_128x128.png"));
		setTitle("Cadastro de Perguntas");
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDePerguntas = new JLabel("Cadastro de Perguntas");
		lblCadastroDePerguntas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadastroDePerguntas.setIcon(new ImageIcon("img/application32.png"));
		lblCadastroDePerguntas.setBounds(149, 22, 259, 51);
		contentPane.add(lblCadastroDePerguntas);
		
		JLabel lblPergunta = new JLabel("Pergunta");
		lblPergunta.setBounds(20, 98, 84, 14);
		contentPane.add(lblPergunta);
		
		textQuestao = new JTextField();
		textQuestao.setBounds(124, 95, 400, 20);
		contentPane.add(textQuestao);
		textQuestao.setColumns(10);
		
		JLabel lblAlternativaA = new JLabel("Alternativa A");
		lblAlternativaA.setBounds(20, 143, 104, 14);
		contentPane.add(lblAlternativaA);
		
		textAlternativaA = new JTextField();
		textAlternativaA.setBounds(124, 140, 334, 20);
		contentPane.add(textAlternativaA);
		textAlternativaA.setColumns(10);
		
		JLabel lblAlternativaB = new JLabel("Alternativa B");
		lblAlternativaB.setBounds(20, 184, 104, 14);
		contentPane.add(lblAlternativaB);
		
		textAlternativaB = new JTextField();
		textAlternativaB.setBounds(124, 181, 334, 20);
		contentPane.add(textAlternativaB);
		textAlternativaB.setColumns(10);
		
		JLabel lblAlternativaC = new JLabel("Alternativa C");
		lblAlternativaC.setBounds(20, 229, 104, 14);
		contentPane.add(lblAlternativaC);
		
		textAlternativaC = new JTextField();
		textAlternativaC.setBounds(123, 226, 334, 20);
		contentPane.add(textAlternativaC);
		textAlternativaC.setColumns(10);
		
		JLabel lblAlternativaD = new JLabel("Alternativa D");
		lblAlternativaD.setBounds(20, 271, 104, 14);
		contentPane.add(lblAlternativaD);
		
		textAlternativaD = new JTextField();
		textAlternativaD.setBounds(124, 268, 334, 20);
		contentPane.add(textAlternativaD);
		textAlternativaD.setColumns(10);
		
		JLabel lblRespostaCerta = new JLabel("Resposta Certa");
		lblRespostaCerta.setBounds(20, 315, 104, 14);
		contentPane.add(lblRespostaCerta);
		
		final ButtonGroup bg = new ButtonGroup();
		
		final JRadioButton rdbtnFacil = new JRadioButton("F\u00E1cil");
		rdbtnFacil.setBounds(124, 357, 109, 23);
		contentPane.add(rdbtnFacil);
		bg.add(rdbtnFacil);
		
		final JRadioButton rdbtnMedio = new JRadioButton("M\u00E9dio");
		rdbtnMedio.setBounds(257, 357, 109, 23);
		contentPane.add(rdbtnMedio);
		bg.add(rdbtnMedio);
	
		final JRadioButton rdbtnDificil = new JRadioButton("Dif\u00EDcil");
		rdbtnDificil.setBounds(415, 357, 109, 23);
		contentPane.add(rdbtnDificil);
		bg.add(rdbtnDificil);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 78, 532, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final ButtonGroup bgroup = new ButtonGroup();
		
		final JRadioButton respCertaA = new JRadioButton("A");
		respCertaA.setBounds(113, 231, 51, 23);
		panel.add(respCertaA);
		bgroup.add(respCertaA);
		
		final JRadioButton respCertaB = new JRadioButton("B");
		respCertaB.setBounds(166, 231, 51, 23);
		panel.add(respCertaB);
		bgroup.add(respCertaB);
		
		final JRadioButton respCertaC = new JRadioButton("C");
		respCertaC.setBounds(219, 231, 45, 23);
		panel.add(respCertaC);
		bgroup.add(respCertaC);
		
		final JRadioButton respCertaD = new JRadioButton("D");
		respCertaD.setBounds(266, 231, 56, 23);
		panel.add(respCertaD);
		bgroup.add(respCertaD);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(SystemColor.menu);
		btnCadastrar.setIcon(new ImageIcon("img/add1-16.png"));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Pergunta perg = new Pergunta();
				PerguntaDao dao = new PerguntaDao();
				
				perg.setQuestao(textQuestao.getText());
				perg.setAlternativaA(textAlternativaA.getText());
				perg.setAlternativaB(textAlternativaB.getText());
				perg.setAlternativaC(textAlternativaC.getText());
				perg.setAlternativaD(textAlternativaD.getText());
			
			    if(respCertaA.isSelected()){
			    	perg.setRespostaCerta(textAlternativaA.getText());
			    }else if(respCertaB.isSelected()){
			    	perg.setRespostaCerta(textAlternativaB.getText());
			    }else if(respCertaC.isSelected()){
			    	perg.setRespostaCerta(textAlternativaC.getText());
			    }else if(respCertaD.isSelected()){
			    	perg.setRespostaCerta(textAlternativaD.getText());
			    }
				
				if((textQuestao.getText().isEmpty())||
				(textAlternativaA.getText().isEmpty())||
				(textAlternativaB.getText().isEmpty())||
				(textAlternativaC.getText().isEmpty())||
				(textAlternativaD.getText().isEmpty())){
					
					JOptionPane.showMessageDialog(null, "� obrigat�rio o preenchimento de todos os campos !");
				}else
				
			    if(rdbtnFacil.isSelected()){
			    	
			    	perg.setNivel(1);
			    	dao.gravarPergunta(perg);
			        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !");
			        limparCampos();
			    }else if(rdbtnMedio.isSelected()){
			    	
			    	perg.setNivel(2);
			    	dao.gravarPergunta(perg);
			    	JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !");
			    	limparCampos();
			    }else if(rdbtnDificil.isSelected()){
			    	
			    	perg.setNivel(3);
			    	dao.gravarPergunta(perg);
			    	JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !");
			    	limparCampos();
			    }
			    
			  }
		});
		btnCadastrar.setBounds(68, 401, 121, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblNvel = new JLabel("N\u00EDvel :");
		lblNvel.setBounds(20, 361, 78, 14);
		contentPane.add(lblNvel);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 387, 532, 3);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("Listar Perguntas");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TabelaPerguntas frame = new TabelaPerguntas();
			    frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(220, 401, 133, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(SystemColor.menu);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparCampos();				
				bgroup.clearSelection();
				bg.clearSelection();
				
			}
		});
		btnLimpar.setBounds(390, 401, 109, 23);
		contentPane.add(btnLimpar);
	}
	
	void limparCampos(){
		
		textQuestao.setText("");
		textAlternativaA.setText("");
		textAlternativaB.setText("");
		textAlternativaC.setText("");
		textAlternativaD.setText("");
		
	}
}
