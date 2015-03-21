package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
//import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_Splash extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Splash frame = new Frm_Splash();
					frame.setLocationRelativeTo( null );//centraliza a tela, antes de mostrar
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
	public Frm_Splash() {
		//Frm_Principal frmPrincipal;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frm_Splash.class.getResource("/imagens/icone_barra_titulo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Frm_Splash.class.getResource("/imagens/LogoLapelinc.jpg")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(121, 24, 362, 287);
		contentPane.add(label);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Frm_Principal  frmPrincipal= new Frm_Principal();
				frmPrincipal.setLocationRelativeTo( null );//centraliza a tela, antes de mostrar
				frmPrincipal.setResizable(false);
				frmPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage(Frm_Principal.class.getResource("/imagens/icone_barra_titulo.png")));
				frmPrincipal.setTitle("Lapelinc - Principal");
				frmPrincipal.setVisible(true);
				Frm_Splash.this.dispose();
			}
		});
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setBounds(220, 298, 157, 40);
		contentPane.add(btnEntrar);
	}
}
