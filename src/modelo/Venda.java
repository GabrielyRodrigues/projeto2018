
package modelo;

import java.util.Date;

public class Venda {
    
    private int id;
    private Date dataVenda;

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    private double precoTotal;
    private double desconto;
    private double precoTotalComDesconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
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
