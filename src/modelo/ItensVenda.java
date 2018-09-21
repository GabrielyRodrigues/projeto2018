
package modelo;


public class ItensVenda {
    
    private int id;
    private double quantidade;
    private double precoUnitario;
    private double descontoUnidade;
    private double precoComDesconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getDescontoUnidade() {
        return descontoUnidade;
    }

    public void setDescontoUnidade(double descontoUnidade) {
        this.descontoUnidade = descontoUnidade;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }
    
    
}
