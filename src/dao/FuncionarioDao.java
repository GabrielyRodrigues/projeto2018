
package dao;
import Telas.Fornecedor;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Funcionario;


public class FuncionarioDao {
    
     public Fornecedor autenticacao (String login,String senha,String cargo ){
    
      
        try (Connection con = Conexao.get()){
            String sql = "SELECT * FROM usuario" +"WHERE login=? and senha=? and cargo=?";
            
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1,login);
            prep.setString(2,senha);
            prep.setString(3, cargo);
            
            ResultSet result = prep.executeQuery();
            
            if (result.first()){
                
            Funcionario  funcionario = new  Funcionario ();
            
            funcionario.setId(result.getInt("id"));
            funcionario.setNome(result.getString("nome"));
            funcionario.setCargo(result.getString("cargo"));
            funcionario.setLogin(login);
            funcionario.setSenha(senha);
           
            
            }
            
        
    } catch(Exception e){
        e.printStackTrace();
        
    }
     return null;
    }     
    
    
}