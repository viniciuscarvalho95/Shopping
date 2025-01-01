public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data dataDeFundacao, Data dataAlvara, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return this.dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString(){
        return "Loja{" + "\nNome: " + super.getnomeLoja()
                + "\nQuantidade de funcionarios " + super.getQuantidadeFuncionarios()
                + "\nSlario Base " + super.getSalarioBaseFuncionario()
                + "\nEdereço "+ super.getEndereco()
                + "\nData de fundação "+ super.getDataFundacao()
                + "\nData do alvará " + dataAlvara + ".}"; }

}
