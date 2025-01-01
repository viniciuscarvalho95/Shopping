public class Loja {
    // Atributos
    private String nomeLoja;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;




    // Construtores
    public Loja(String nomeLoja, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                Endereco endereco, Data dataDeFundacao, int quantidadeProdutos) {
        this.nomeLoja = nomeLoja;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public Loja(String nomeLoja, int quantidadeFuncionarios, Endereco endereco, 
                Data data, int quantidadeProdutos) {
        this.nomeLoja = nomeLoja;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = data;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    // Métodos de acesso
    public String getnomeLoja() { 
        return this.nomeLoja;
    }
    public void setnomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Data getDataFundacao() {
        return dataFundacao;
    }
    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataDeFundacao;
    }
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    public void setEstoquesProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
   

    public double gastosComSalario() {
        if (salarioBaseFuncionario >= 0) {
           return (quantidadeFuncionarios * salarioBaseFuncionario);
        } else {
            return -1;
        }
    }

    public char tamanhoDaLoja() { 
        if (quantidadeFuncionarios >= 31) {
            return 'G';
        } else if (quantidadeFuncionarios <= 30 && quantidadeFuncionarios >= 10) {
            return 'M';
        } else {
            return 'P';
        }
    }

    public void imprimeProdutos(){
      for (int i=0;i <estoqueProdutos.length;i++)
        if (estoqueProdutos[i] != null)
            System.out.println(estoqueProdutos[i].getnomeProduto());
    }
    public boolean insereProduto(Produto novoProduto){
        for (int i=0;i <estoqueProdutos.length;i++)
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = novoProduto;
                return true;
            }
        return false;
    }
    public boolean removeProduto(String produto){
        for (int i = 0;i <estoqueProdutos.length; i++)
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getnomeProduto().equalsIgnoreCase(produto)){
                estoqueProdutos[i] = null;
                return true;
            }
        return false;
    }

    // Método ToString
    public String toString() {
        return ( "DADOS DA LOJA\n"+
            "Loja" + "\nNomeLoja: " + this.nomeLoja
                + "\nQuantidade de funcionarios " + quantidadeFuncionarios
                + "\nSalario Base " + salarioBaseFuncionario
                + "\nEdereço "+ endereco
                + "\nData de fundação "+ dataFundacao + ".");
            
    }
}
