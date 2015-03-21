package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.Connection; 


//import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
 
import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frm_Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected Frm_CadastrarLivro frmCadastrarLivro;
	protected Frm_CadastrarDocumento frmCadastrarDocumentos;
	protected Frm_CadastroDeItens frmCadastroDeItens;
	protected static Frm_Principal frmPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal = new Frm_Principal();
					Frm_Splash frmSplash = new Frm_Splash();
					//frame.setLocationRelativeTo( null );//centraliza a tela, antes de mostrar
					frmSplash.setVisible(true);
					frmPrincipal.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frm_Principal() {
		// You should work with UI (including installing L&F) inside Event Dispatch Thread (EDT)	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 539);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 Connection conn = new Conexao().conectar();
		 if(conn != null)
			 System.out.println("Conexão efetuada com sucesso!");
		 else
			 System.out.println("Problemas!"); 
		
		JLabel lb_CadastrarLivro = new JLabel("");
		lb_CadastrarLivro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Clicando no Cadastro de Livros");
				frmCadastrarLivro = new Frm_CadastrarLivro("Cadastro de Livro", frmPrincipal);
				contentPane.add(frmCadastrarLivro);
			}
		});
		lb_CadastrarLivro.setIcon(new ImageIcon(Frm_Principal.class.getResource("/imagens/ícone_livro220x210.png")));
		lb_CadastrarLivro.setHorizontalAlignment(SwingConstants.CENTER);
		lb_CadastrarLivro.setBounds(50, 23, 220, 220);
		contentPane.add(lb_CadastrarLivro);
		
		JLabel lb_CadastrarDocumentos = new JLabel("");
		lb_CadastrarDocumentos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Clicando no Cadastro de Documentos");
				frmCadastrarDocumentos = new Frm_CadastrarDocumento("Cadastro de Documentos", frmPrincipal);
				contentPane.add(frmCadastrarDocumentos);
			}
		});
		lb_CadastrarDocumentos.setIcon(new ImageIcon(Frm_Principal.class.getResource("/imagens/icone_documento220x220.png")));
		lb_CadastrarDocumentos.setHorizontalAlignment(SwingConstants.CENTER);
		lb_CadastrarDocumentos.setBounds(364, 23, 220, 220);
		contentPane.add(lb_CadastrarDocumentos);
		
		
		JLabel lb_CadastrarItens = new JLabel("");
		lb_CadastrarItens.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Clicando no Cadastro de Itens");
				frmCadastroDeItens = new Frm_CadastroDeItens("Cadastro de Itens", frmPrincipal);
				contentPane.add(frmCadastroDeItens);
			}
		});
		lb_CadastrarItens.setIcon(new ImageIcon(Frm_Principal.class.getResource("/imagens/icone_documento220x220.png")));
		lb_CadastrarItens.setHorizontalAlignment(SwingConstants.CENTER);
		lb_CadastrarItens.setBounds(50, 255, 220, 220);
		contentPane.add(lb_CadastrarItens);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Frm_Principal.class.getResource("/imagens/ícone_livro220x210.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(358, 255, 232, 220);
		contentPane.add(lblNewLabel_2);
	}
}
