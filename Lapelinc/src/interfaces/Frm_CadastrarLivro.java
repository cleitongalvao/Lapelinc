package interfaces;

import javax.swing.JInternalFrame;
import java.awt.Color;

@SuppressWarnings("serial")
public class Frm_CadastrarLivro extends JInternalFrame {
	@SuppressWarnings("unused")
	private Frm_Principal telaPrincipal;

	public Frm_CadastrarLivro(String titulo, Frm_Principal telaPrincipal) {
		super(titulo,false,true,false,false);
		getContentPane().setBackground(Color.WHITE);
		setBounds(0, 0, 636, 539);
		setMaximizable(false);
		setVisible(true);
		this.telaPrincipal = telaPrincipal;

	}

}