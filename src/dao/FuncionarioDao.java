
package dao;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Funcionario;


public class FuncionarioDao {
    
    public Funcionario autenticacao (String login,String senha){
    
        Funcionario funcionario = null;
        
        try (Connection con = Conexao.get()){
            String sql = "SELECT * FROM usuario" +"WHERE login=? and senha=?";
            
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1,login);
            prep.setString(2,senha);
            
            ResultSet result = prep.executeQuery();
            
            if (result.first()){
                
            funcionario = new Funcionario ();
            
            funcionario.setId(result.getInt("id"));
            funcionario.setNome(result.getString("nome"));
            funcionario.setCargo(result.getString("cargo"));
            funcionario.setLogin(login);
            funcionario.setSenha(senha);
            return funcionario;
            
            }
            
        
    } catch(Exception e){
        e.printStackTrace();
        
    }
        return funcionario;
    }     
    
    
}
