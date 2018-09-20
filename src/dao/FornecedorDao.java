
package dao;

import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Fornecedor;





public class FornecedorDao {
    
    public boolean salvar( Fornecedor fornecedor) {

        try (Connection con = Conexao.get();) {

            String sql = "insert into pessoa(nome,idade,email) values(?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, fornecedor.getNome());
           
      

            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean alterar(Fornecedor novoFornecedor) {

        try (Connection con = Conexao.get();) {

            String sql = "update pessoa set "
                    + "nome=?,"
                    + "idade=?,"
                    + "email=? "
                    + "where id =" + novoFornecedor.getId();

            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, novoFornecedor.getNome());
    
       
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean excluir(int id) {

        try (Connection con = Conexao.get();) {

            String sql = "delete from pessoa where id =" + id;

            PreparedStatement prep = con.prepareStatement(sql);
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public List<Fornecedor> buscar() {

        List<Fornecedor> list = new ArrayList<>();
        
        try (Connection con = Conexao.get();) {

            String sql = "select * from pessoa";

            PreparedStatement prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();

            while (result.next()) {

                Fornecedor forne = new Fornecedor();
                forne.setId(result.getInt("id"));
                forne.setNome(result.getString("nome"));
            
              

                list.add(forne);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        
        return list;
        
    }
    
     
}


