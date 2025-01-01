public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data dataDeFundacao, double seguroEletronicos, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return this.seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString(){
        return "Loja{" + "\nNome: " + super.getnomeLoja()
                + "\nQuantidade de funcionarios " + super.getQuantidadeFuncionarios()
                + "\nSlario Base " + super.getSalarioBaseFuncionario()
                + "\nEdereço "+ super.getEndereco()
                + "\nData de fundação "+ super.getDataFundacao()
                + "\nSeguro " + seguroEletronicos + ".}"; 
            }
}
