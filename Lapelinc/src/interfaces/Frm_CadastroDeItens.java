package interfaces;

//import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;

@SuppressWarnings("serial")
public class Frm_CadastroDeItens extends JInternalFrame {
	@SuppressWarnings("unused")
	private Frm_Principal telaPrincipal;

	public Frm_CadastroDeItens(String titulo, Frm_Principal telaPrincipal) {
		super(titulo,false,true,false,false);
		setBackground(Color.WHITE);
		setBounds(0, 0, 636, 539);
		setMaximizable(false);
		setVisible(true);
		this.telaPrincipal = telaPrincipal;

	}

}