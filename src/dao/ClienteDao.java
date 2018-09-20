package dao;

import Telas.TelaCliente;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;


public class ClienteDao {
 public boolean salvar(Cliente cliente) {

        try (Connection con = Conexao.get();) {

            String sql = "insert into pessoa(nome,idade,email) values(?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, cliente.getNome());
           
            prep.setString(3, cliente.getEmail());

            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean alterar(Cliente novoCliente) {

        try (Connection con = Conexao.get();) {

            String sql = "update pessoa set "
                    + "nome=?,"
                    + "idade=?,"
                    + "email=? "
                    + "where id =" + novoCliente.getId();

            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, novoCliente.getNome());
    
            prep.setString(3, novoCliente.getEmail());
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

    public List<Cliente> buscar() {

        List<Cliente> list = new ArrayList<>();
        
        try (Connection con = Conexao.get();) {

            String sql = "select * from pessoa";

            PreparedStatement prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();

            while (result.next()) {

                Cliente c = new Cliente();
                c.setId(result.getInt("id"));
                c.setNome(result.getString("nome"));
            
                c.setEmail(result.getString("email"));

                list.add(c);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        
        return list;
        
    }

    public boolean salvar(TelaCliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
