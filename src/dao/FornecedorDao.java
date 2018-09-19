
package dao;

import Telas.Fornecedor;
import banco.Conexao;
import java.sql.Connection;



public class FornecedorDao {
    
     public Fornecedor salvar (Fornecedor fornecedor){
    
       
        
        try (Connection con = Conexao.get()){
            
            
            
            
            } catch(Exception e){
        e.printStackTrace();
        
    }
        return fornecedor;
        }
}

