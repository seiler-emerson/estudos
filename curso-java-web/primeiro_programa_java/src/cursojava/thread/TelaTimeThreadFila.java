package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThreadFila extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes

	private JLabel descricaoHora = new JLabel("Nome:");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButtom = new JButton("Add Lista");
	private JButton jButtom2 = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThreadFila() { // Executa o que estiver dentro no momento da abertura ou execucao

		// PRIMEIRA PARTE

		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		// PRIMEIRA PARTE CONCLUIDA

		GridBagConstraints bagConstraints = new GridBagConstraints(); // Controlador de posicionamento de componentes
		bagConstraints.gridx = 0;
		bagConstraints.gridy = 0;
		bagConstraints.gridwidth = 2;
		bagConstraints.insets = new Insets(5, 10, 5, 5);
		bagConstraints.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, bagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(mostraTempo, bagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(descricaoHora2, bagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(mostraTempo2, bagConstraints);

		bagConstraints.gridwidth = 1;

		jButtom.setPreferredSize(new Dimension(92, 25));
		bagConstraints.gridy++;
		jPanel.add(jButtom, bagConstraints);

		jButtom2.setPreferredSize(new Dimension(92, 25));
		bagConstraints.gridx++;
		jPanel.add(jButtom2, bagConstraints);

		jButtom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // Executa o clique no botao

				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				for (int count = 0; count < 100; count++) { // Simulando 100 envios em massa

					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText()+ " - "+count);

					fila.add(filaThread);
				}
			}
		});

		jButtom2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // Executa o clique no botao

				fila.stop();
				fila = null;
			}
		});

		fila.start();

		add(jPanel, BorderLayout.WEST);
		// sempre sera o ultimo comando
		setVisible(true); // Torna a tela visivel para o usuario.
	}

}
