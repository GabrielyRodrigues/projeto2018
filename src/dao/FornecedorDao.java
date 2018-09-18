
package dao;

import Telas.Fornecedor;
import banco.Conexao;
import java.sql.Connection;


public class FornecedorDao {
    
     public Fornecedor autenticacao (String nome,String cnpj){
    
        Fornecedor fornecedor = null;
        
        try (Connection con = Conexao.get()){
            
            
            
            } catch(Exception e){
        e.printStackTrace();
        
    }
        return fornecedor;
        }
}
