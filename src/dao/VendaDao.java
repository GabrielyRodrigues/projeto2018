
package dao;

import Telas.TelaVenda;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Venda;


public class VendaDao {
    
    public boolean salvar(Venda venda){
    
     
   try (Connection con = Conexao.get();) {

            String sql = "SELECT * FORM venda"+" WHERE (dataVenda,precoTotal,desconto,precoTotalComDesconto) values(?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
          
             prep.setDouble(3,venda.getPrecoTotal());
            prep.setDouble(4,venda.getDesconto());
          
           
            
          ResultSet result = prep.executeQuery();
            
            if (result.first()){
                
            venda = new Venda ();
            
            venda.setId(result.getInt("id"));
            
           
            
            }
            
        

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }
    
}
