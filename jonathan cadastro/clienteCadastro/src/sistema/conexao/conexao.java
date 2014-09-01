package sistema.conexao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class conexao {

Connection con;
private Connection OCon;
private Statement sStmt;

public conexao (){

}

public Connection abrirBDConn(){

try{
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/banco";
con = DriverManager.getConnection(url,"root","240793");
   System.out.println("Conexão efetuada com sucesso");	
   return con;
}
catch(Exception e){

System.out.println("Erro ao abrir conexão com banco:");
e.printStackTrace();
return null;

}

}

public void fecharBDConn(){

try{
con.close();
System.out.println("Conexão finalizada com sucesso");	
}catch(Exception e){
System.out.println("Erro ao fechar conexão com banco " + e.getMessage());
}

}

}