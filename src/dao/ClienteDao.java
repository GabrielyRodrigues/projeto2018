package dao;

import Telas.Cliente;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {

    public boolean salvar(Cliente cliente) {

        
        try (Connection con = Conexao.get();) {

            String sql = "insert into cliente (nome,datanascimento,email) values(?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, cliente.getName());
           

            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();

        }
        return false;
    }
}
