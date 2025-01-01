public class Produto {
    private String nomeProduto;
    private double preco;
    private Data dataValidade;

    
    //Método construtor
    public Produto(String nomeProduto, double preco, Data dataValidade){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    //Métodos de acesso
    public String getnomeProduto() {
        return nomeProduto;
    }
    public double getPreco() {
        return preco;
    }
    public void setnomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Data getDataValidade() {
        return this.dataValidade;
    }
    public void setDataValidade(Data dataDeValidade) {
        this.dataValidade = dataDeValidade;
    }

    public String toString(){
        return ("nomeProduto: " + nomeProduto +"Preço: R$"+ preco + "Data de Validade " + dataValidade);
    }

    //Método estaVencido verifica a data de validade
    public boolean estaVencido(Data dataRecebida){
        if (dataRecebida.getAno() < dataValidade.getAno()){
            return false;}
        else if (dataRecebida.getAno() == dataValidade.getAno())
               if (dataRecebida.getMes() < dataValidade.getMes()){
            return false;}
        else if (dataRecebida.getMes() == dataValidade.getMes())
             if (dataRecebida.getDia() <= dataValidade.getDia())
                return false;
        
        return true;
    }

    

}
