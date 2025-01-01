public class Bijuteria extends Loja {
    private double metaVendas;

    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data dataDeFundacao, double metaVendas, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }
    public double getMetaVendas() {
        return this.metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
    public String toString(){
        return "Loja{" + "Nome: " + super.getnomeLoja()
                + "\nQuantidade de funcionarios " + super.getQuantidadeFuncionarios()
                + "\nSlario Base " + super.getSalarioBaseFuncionario()
                + "\nEdereço "+ super.getEndereco()
                + "\nData de fundação "+ super.getDataFundacao()
                + "\nMeta " + metaVendas; }

}
