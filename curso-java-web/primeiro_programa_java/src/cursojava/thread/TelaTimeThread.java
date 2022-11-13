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

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes

	private JLabel descricaoHora = new JLabel("Time da Thread 1");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time da Thread 2");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButtom = new JButton("Start");
	private JButton jButtom2 = new JButton("Stop");

	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			while (true) { // vai ficar sendo executado
				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};

	
	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			while (true) { // vai ficar sendo executado
				mostraTempo2
						.setText(new SimpleDateFormat("dd/MM hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};

	private Thread thread1Time;
	private Thread thread2Time;

	public TelaTimeThread() { // Executa o que estiver dentro no momento da abertura ou execucao

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
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, bagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(descricaoHora2, bagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		mostraTempo2.setEditable(false);
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

				thread1Time = new Thread(thread1);
				thread1Time.start();
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButtom2.setEnabled(true);
				jButtom.setEnabled(false);

			}
		});

		jButtom2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // Executa o clique no botao

				thread1Time.stop();
				thread2Time.stop();

				jButtom2.setEnabled(false);
				jButtom.setEnabled(true);

			}
		});
	
		jButtom2.setEnabled(false);

		add(jPanel, BorderLayout.WEST);
		// sempre sera o ultimo comando
		setVisible(true); // Torna a tela visivel para o usuario.
	}

}
