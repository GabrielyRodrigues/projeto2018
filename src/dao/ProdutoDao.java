/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Produto;


public class ProdutoDao {
    
    
    
    public boolean salvar(Produto produto) {

        try (Connection con = Conexao.get();) {

            String sql = "SELECT * FORM produto"+" WHERE (nome,descricao,precoCusto,porcentagemLucro,precoVenda,quantidadeEstoque,unidade) values(?,?,?,?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setString(2, produto.getDescricao());
            prep.setDouble(3,produto.getPrecoCusto());
            prep.setDouble(4,produto.getPorcentagemLucro());
            prep.setDouble(5,produto.getPrecoVenda());
            prep.setDouble(6,produto.getQuantidadeEstoque());
            prep.setString(7,produto.getUnidade());
            
          

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }
}
    
    
