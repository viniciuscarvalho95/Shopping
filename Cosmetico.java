public class Cosmetico extends Loja {
    private double taxaComercializacao;

    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
    Endereco endereco, Data dataDeFundacao, double taxaComercializacao, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataDeFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    //sets e gets
    public double getTaxaComercializacao() {
        return this.taxaComercializacao;
    }  
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public String toString(){
        return "Loja{" + "Nome: " + super.getnomeLoja()
                + "Quantidade de funcionarios " + super.getQuantidadeFuncionarios()
                + "Slario Base " + super.getSalarioBaseFuncionario()
                + "Edereço "+ super.getEndereco()
                + "Data de fundação "+ super.getDataFundacao()
                + "Taxa " + taxaComercializacao;
    }
}
