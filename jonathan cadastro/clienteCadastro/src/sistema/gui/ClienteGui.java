package sistema.gui;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import sistema.bin.ClienteBin;
import sistema.control.ClienteControl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel btncadastrar;
	private JTextField jtfNome;
	private JTextField jtfEndereco;
	private JTextField jtfTelefone;
	private JTextField jtfEmail;
	private JTextField jtfCidade;
	private JTextField jtfEstado;

	
		
	ClienteControl CliControl = new ClienteControl();
	ClienteBin CliBin = new ClienteBin();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteGui frame = new ClienteGui();
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
	public ClienteGui() {
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 428);
		btncadastrar = new JPanel();
		btncadastrar.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(btncadastrar);
		btncadastrar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clinte");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 32, 225, 49);
		btncadastrar.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 117, 69, 14);
		btncadastrar.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 142, 69, 14);
		btncadastrar.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 167, 69, 14);
		btncadastrar.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(10, 192, 80, 14);
		btncadastrar.add(lblEndereco);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 217, 69, 14);
		btncadastrar.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 246, 69, 14);
		btncadastrar.add(lblEstado);
		
		jtfNome = new JTextField();
		jtfNome.setBounds(117, 114, 384, 20);
		btncadastrar.add(jtfNome);
		jtfNome.setColumns(10);
		
		jtfEmail = new JTextField();
		jtfEmail.setBounds(117, 139, 384, 20);
		btncadastrar.add(jtfEmail);
		jtfEmail.setColumns(10);
		
		jtfTelefone = new JTextField();
		jtfTelefone.setBounds(117, 164, 384, 20);
		btncadastrar.add(jtfTelefone);
		jtfTelefone.setColumns(10);
		
		jtfEndereco = new JTextField();
		jtfEndereco.setBounds(117, 189, 384, 20);
		btncadastrar.add(jtfEndereco);
		jtfEndereco.setColumns(10);
		
		jtfCidade = new JTextField();
		jtfCidade.setBounds(117, 217, 384, 20);
		btncadastrar.add(jtfCidade);
		jtfCidade.setColumns(10);
		
		jtfEstado = new JTextField();
		jtfEstado.setBounds(117, 243, 384, 20);
		btncadastrar.add(jtfEstado);
		jtfEstado.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = jtfNome.getText();
				String email = jtfEmail.getText();
				String telefone = jtfTelefone.getText();
				String endereco = jtfEndereco.getText();
				String cidade = jtfCidade.getText();
				String estado = jtfEstado.getText();
				
				CliControl.InsireDados(nome,email,telefone,endereco,cidade,estado);
			}
		});
		btnCadastrar.setBounds(341, 294, 108, 23);
		btncadastrar.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtfNome.setText("");
				jtfEmail.setText("");
				jtfTelefone.setText("");
				jtfEndereco.setText("");
				jtfCidade.setText("");
				jtfEstado.setText("");
			}
		});
		btnLimpar.setBounds(242, 294, 89, 23);
		btncadastrar.add(btnLimpar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do cliente: "));
				CliControl.ExcluirCliente(codigo);
				
				
				
			}
		});
		btnExcluir.setBounds(146, 294, 89, 23);
		btncadastrar.add(btnExcluir);
		
		JButton btnAtualizaer = new JButton("Atualizar");
		btnAtualizaer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CliControl.AtualizarDados(jtfNome.getText(), jtfEmail.getText(), jtfEndereco.getText(), 
						jtfTelefone.getText(), jtfCidade.getText(), jtfEstado.getText(), CliBin);
				
			}
		});
		btnAtualizaer.setBounds(10, 294, 89, 23);
		btncadastrar.add(btnAtualizaer);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do cliente: "));
			CliControl.BuscarDados(codigo,CliBin);
			jtfNome.setText(CliBin.getNome());
			jtfEmail.setText(CliBin.getEmail());
			jtfTelefone.setText(CliBin.getTelefone());
			jtfEndereco.setText(CliBin.getEndereco());
			jtfCidade.setText(CliBin.getCidade());
			jtfEstado.setText(CliBin.getEstado());
			}
		});
		btnBuscar.setBounds(413, 355, 89, 23);
		btncadastrar.add(btnBuscar);
	}
}
