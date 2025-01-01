public class Vestuario extends Loja{
    private boolean produtosImportados;
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                        Endereco endereco, Data dataDeFundacao, boolean produtosImportados, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataDeFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }
    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    public String toString(){
        String importado;
        if (produtosImportados == true){
            importado ="Importado";
        } importado = "nacional";
        return "Loja{" + "Nome: " + super.getnomeLoja()
                + "Quantidade de funcionarios " + super.getQuantidadeFuncionarios()
                + "Slario Base " + super.getSalarioBaseFuncionario()
                + "Edereço "+ super.getEndereco()
                + "Data de fundação "+ super.getDataFundacao()
                + importado;
    
            
                
    }
}
