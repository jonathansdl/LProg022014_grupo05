package sistema.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import sistema.bin.ProdutoBin;
import sistema.control.ProdutoControl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProdutoGui extends JFrame {

	private JPanel contentPane;
	private JTextField jtfNome;
	private JTextField jtfQuantidade;
	private JTextField jtfDescricao;
	private JTextField jtfCarros;
	private JTextField jtfCusto;
	private JTextField jtfVenda;

	
	ProdutoControl ProControl = new ProdutoControl();
	ProdutoBin ProBin = new ProdutoBin();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdutoGui frame = new ProdutoGui();
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
	public ProdutoGui() {
		setTitle("Cadastro Produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 39, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(419, 39, 73, 14);
		contentPane.add(lblQuantidade);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7ao:");
		lblDescricao.setBounds(10, 97, 73, 14);
		contentPane.add(lblDescricao);
		
		JLabel lblPrecoDeCusto = new JLabel("Preco de Custo:");
		lblPrecoDeCusto.setBounds(10, 64, 147, 14);
		contentPane.add(lblPrecoDeCusto);
		
		JLabel lblPrecoDeVenda = new JLabel("Preco de Venda:");
		lblPrecoDeVenda.setBounds(272, 64, 114, 14);
		contentPane.add(lblPrecoDeVenda);
		
		JLabel lblCarros = new JLabel("Carros:");
		lblCarros.setBounds(10, 174, 46, 14);
		contentPane.add(lblCarros);
		
		jtfNome = new JTextField();
		jtfNome.setBounds(48, 36, 361, 20);
		contentPane.add(jtfNome);
		jtfNome.setColumns(10);
		
		jtfQuantidade = new JTextField();
		jtfQuantidade.setBounds(495, 36, 64, 20);
		contentPane.add(jtfQuantidade);
		jtfQuantidade.setColumns(10);
		
		jtfDescricao = new JTextField();
		jtfDescricao.setBounds(78, 97, 481, 58);
		contentPane.add(jtfDescricao);
		jtfDescricao.setColumns(10);
		
		jtfCarros = 
				new JTextField();
		jtfCarros.setBounds(61, 172, 498, 58);
		contentPane.add(jtfCarros);
		jtfCarros.setColumns(10);
		
		jtfCusto = new JTextField();
		jtfCusto.setBounds(101, 61, 127, 20);
		contentPane.add(jtfCusto);
		jtfCusto.setColumns(10);
		
		jtfVenda = new JTextField();
		jtfVenda.setBounds(367, 61, 125, 20);
		contentPane.add(jtfVenda);
		jtfVenda.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String nome = jtfNome.getText();
					String quantidade = jtfQuantidade.getText();
					String descriçao = jtfDescricao.getText();
					String carros = jtfCarros.getText();
					String custo = jtfCusto.getText();
					String venda = jtfVenda.getText();
					
					ProControl.InsireDados(nome,quantidade,descriçao,carros,custo,venda);
				
			}
		});
		btnCadastrar.setBounds(208, 271, 95, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfNome.setText("");
				jtfQuantidade.setText("");
				jtfDescricao.setText("");
				jtfCarros.setText("");
				jtfCusto.setText("");
				jtfVenda.setText("");
			}
		});
		btnLimpar.setBounds(320, 271, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do cliente: "));
				ProControl.ExcluirCliente(codigo);
			}
		});
		btnExcluir.setBounds(109, 271, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProControl.AtualizarDados(jtfNome.getText(), jtfQuantidade.getText(), jtfDescricao.getText(), 
						jtfCarros.getText(), jtfCusto.getText(), jtfVenda.getText(), ProBin);
			}
		});
		btnAtualizar.setBounds(425, 271, 89, 23);
		contentPane.add(btnAtualizar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do produto: "));
				ProControl.BuscarDados(codigo,ProBin);
				jtfNome.setText(ProBin.getNome());
				jtfQuantidade.setText(ProBin.getQuantidade());
				jtfDescricao.setText(ProBin.getDescricao());
				jtfCarros.setText(ProBin.getCarros());
				jtfCusto.setText(ProBin.getCusto());
				jtfVenda.setText(ProBin.getVenda());
			}
		});
		btnBuscar.setBounds(10, 271, 89, 23);
		contentPane.add(btnBuscar);
	}
}
