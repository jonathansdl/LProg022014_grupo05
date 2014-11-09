
package RegistrarVendas;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class VendasControl {
    PreparedStatement pstm;
    ResultSet rs;
    
    
    private static final java.sql.Connection ExConn = null;
    private String nome;
    private String quantidade;
    private String descricao;
    private String carros;
    private String custo;
    private String venda;
    
    public VendasControl(){
        
    }
    
   
   
    
    public void cadastrarVenda () {
			Produtos.conexao banco = new Produtos.conexao();
			String retorno = "erro";
			try{

			Connection con = (Connection) banco.abrirBDConn();
                            try (Statement stmt = (Statement) con.createStatement()) {
                                String sSQL = "INSERT INTO banco.produto VALUES(null,'"+nome+"','"+quantidade+"','"+descricao+"','"+ carros+"','"+custo+"','"+venda+"');";
                                System.out.print(sSQL);
                                boolean res = stmt.execute(sSQL);
                                
                                JOptionPane.showMessageDialog(null,(!res)?"Dados inseridos com sucesso!":"" + "Os dados não puderam ser inseridos...");
                            }
			banco.fecharBDConn();
			}catch(HeadlessException | SQLException e){
			JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos...");
			}
			
			}

    int byscarCodigoUltimaVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
