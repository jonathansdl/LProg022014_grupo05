package Produtos;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class ProdutoControl {

	private static final java.sql.Connection ExConn = null;


	public  void InsireDados(String nome,String quantidade,String descricao,String carros,String custo,String venda){
			conexao banco = new conexao();
			String retorno = "erro";
			try{

			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			String sSQL = "INSERT INTO banco.produto VALUES(null,'"+nome+"','"+quantidade+"','"+descricao+"','"+ carros+"','"+custo+"','"+venda+"');";
			System.out.print(sSQL);
			boolean res = stmt.execute(sSQL);

			JOptionPane.showMessageDialog(null,(!res)?"Dados inseridos com sucesso!":"" + "Os dados não puderam ser inseridos...");
			stmt.close();
			banco.fecharBDConn();
			}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos...");
			}
			
			}
		
	
	public void ExcluirCliente(int codigo){
		conexao banco = new conexao();
		
		try{
			
			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			String sSQL = "DELETE FROM banco.produto WHERE idProduto = "+codigo+";" ;
			boolean rs = stmt.execute(sSQL);
			JOptionPane.showMessageDialog(null,(!rs )? "Dados do cliente excluidos com sucesso.":"Dados donao foi encontrado com sucesso.") ;
		
			stmt.close();
			banco.fecharBDConn();		
		}catch (Exception e){
			
			JOptionPane.showMessageDialog(null,"Os dados não foram encontrados.");
			
			
		}
		
	}
	
	public String AtualizarDados(String nome,String quantidade,String descricao,String carros,String custo,String venda,
			ProdutoBin ProBin){
		conexao banco = new conexao();
		String retorno = "erro";
		int res;
		
		try{
			
			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			
			res = stmt.executeUpdate("UPDATE  banco.produto SET nome = '"+nome+"', quantidade = '"+quantidade+"', descri�ao = '"+descricao+"',"
					+ " carros = '"+ carros+"', precoCusto = '"+custo+"', precoVenda = '"+venda+"' WHERE idProduto ="+ProBin.getCodigo()) ;
			if(res==1)JOptionPane.showMessageDialog(null, "Dados do produto atualizados com sucesso.") ;
			stmt.close();
			banco.fecharBDConn();		
		}catch (Exception e){
			
			JOptionPane.showMessageDialog(null,"Os dados não puderam ser atualizados.");
			
			
		}
		return retorno;
		
	}
	
	public void BuscarDados (int codigo,ProdutoBin ProBin){
		conexao banco = new conexao();
try{
			
			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			String sSQL = "SELECT * FROM banco.produto WHERE idProduto = "+codigo ;
			ResultSet rs = stmt.executeQuery(sSQL);
			
			while(rs.next())
			{
				ProBin.setCodigo(rs.getInt("idProduto"));
				ProBin.setNome  (rs.getString("nome"));
				ProBin.setQuantidade  (rs.getString("quantidade"));
				ProBin.setDescricao  (rs.getString("descri�ao"));
				ProBin.setCarros  (rs.getString("carros"));
				ProBin.setCusto  (rs.getString("precoCusto"));
				ProBin.setVenda (rs.getString("precoVenda"));
			}
					
					stmt.close();
					banco.fecharBDConn();		
				}catch (Exception e){
					
					JOptionPane.showMessageDialog(null,"Os dados não puderam ser encontrados.");
			}
			
				
}


	
	}