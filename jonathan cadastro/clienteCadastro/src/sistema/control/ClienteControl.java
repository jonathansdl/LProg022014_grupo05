package sistema.control;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import sistema.bin.ClienteBin;
import sistema.conexao.conexao;


public class ClienteControl {
	
	private static final java.sql.Connection ExConn = null;


	public  void InsireDados(String nome,String email,String endereco,String telefone,String cidade,String estado){
			conexao banco = new conexao();
			String retorno = "erro";
			try{

			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			String sSQL = "INSERT INTO banco.cliente VALUES(null,'"+nome+"','"+email+"','"+telefone+"','"+ endereco+"','"+cidade+"','"+estado+"');";
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
			String sSQL = "DELETE FROM banco.cliente WHERE idCliente = "+codigo+";" ;
			boolean rs = stmt.execute(sSQL);
			JOptionPane.showMessageDialog(null,(!rs )? "Dados do cliente excluidos com sucesso.":"Dados donao foi encontrado com sucesso.") ;
		
			stmt.close();
			banco.fecharBDConn();		
		}catch (Exception e){
			
			JOptionPane.showMessageDialog(null,"Os dados não foram encontrado...");
			
			
		}
		
	}
	
	public String AtualizarDados(String nome,String email,String endereco,String telefone,String cidade,String estado,
			ClienteBin CliBin){
		conexao banco = new conexao();
		String retorno = "erro";
		int res;
		
		try{
			
			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			
			res = stmt.executeUpdate("UPDATE  banco.cliente SET nome = '"+nome+"', email = '"+email+"', telefone = '"+telefone+"',"
					+ " endereco = '"+ endereco+"', cidade = '"+cidade+"', estado = '"+estado+"' WHERE idCliente ="+CliBin.getCodigo()) ;
			if(res==1)JOptionPane.showMessageDialog(null, "Dados do cliente atualizados com sucesso.") ;
			stmt.close();
			banco.fecharBDConn();		
		}catch (Exception e){
			
			JOptionPane.showMessageDialog(null,"Os dados não puderam ser atualizados...");
			
			
		}
		return retorno;
		
	}
	
	public void BuscarDados (int codigo,ClienteBin CliBin){
		conexao banco = new conexao();
try{
			
			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			String sSQL = "SELECT * FROM banco.cliente WHERE idCliente = "+codigo ;
			ResultSet rs = stmt.executeQuery(sSQL);
			
			while(rs.next())
			{
					CliBin.setCodigo(rs.getInt("idCliente"));
					CliBin.setNome  (rs.getString("nome"));
					CliBin.setEndereco  (rs.getString("endereco"));
					CliBin.setEstado  (rs.getString("estado"));
					CliBin.setCidade  (rs.getString("cidade"));
					CliBin.setTelefone  (rs.getString("telefone"));
					CliBin.setEmail (rs.getString("email"));
			}
					
					stmt.close();
					banco.fecharBDConn();		
				}catch (Exception e){
					
					JOptionPane.showMessageDialog(null,"Os dados não puderam ser atualizados...");
			}
			
				
}


	
	}

			