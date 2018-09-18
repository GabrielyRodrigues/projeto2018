
package dao;
import banco.Conexao;
import java.sql.Connection;
import modelo.Funcionario;


public class FuncionarioDao {
    
    public Funcionario autenticacao (String login,String senha){
    
        Funcionario funcionario = null;
        
        try (Connection con = Conexao.get()){
        
    } catch(Exception e){
        
    }
        return funcionario;
    }     
    
    
}
