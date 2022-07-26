package cursojava.thread;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class TelaTimeThread extends JDialog{

	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	
	public TelaTimeThread() {	//Executa o que tiver dentro no momento da abertuta/execução
		
		setTitle("Tela de Time com Thread!");
		setSize(new Dimension(250,250));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		
		
		//Sempre será o ultimo comando
		setVisible(true);	//Torna a tela visivel para o usuário.
	}
	
	
}
