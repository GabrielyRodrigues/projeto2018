
package modelo;

import java.util.Date;

public class Venda {
    
    private int id;
    private Date    DataVenda;
    private double PrecoTotal;
    private double desconto;
    private double precoTotalComDesconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.DataVenda = dataVenda;
    }

    public double getPrecoTotal() {
        return PrecoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.PrecoTotal = precoTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoTotalComDesconto() {
        return precoTotalComDesconto;
    }

    public void setPrecoTotalComDesconto(double precoTotalComDesconto) {
        this.precoTotalComDesconto = precoTotalComDesconto;
    }
    

   
    }
 