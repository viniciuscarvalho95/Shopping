public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantLojas];
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public String toString(){
        return "DADOS DO SHOPPING\n\n"
        +       "Shopping " + nome +
                "\nEndereço" + endereco +
                "\nLojas" + imprimeNomeDaLoja();  
    }

    public String imprimeNomeDaLoja(){
        String nomeDaLoja = null;
        for (int i = 0; i<lojas.length;i++)
            if (lojas[i] != null)
                nomeDaLoja = lojas[i].getnomeLoja();
        return nomeDaLoja;
    }

    public boolean insereLoja(Loja novaLoja){
        for (int i=0;i <lojas.length;i++)
            if (lojas[i] == null){
                lojas[i] = novaLoja;
                return true;
            }
        return false;
    }
    
    public boolean removeLoja(String loja){
        for (int i = 0; i < lojas.length;i++)
            if (lojas[i] != null && lojas[i].getnomeLoja().equalsIgnoreCase(loja)){
                lojas[i] = null;
                return true;
            }
        return false;

    }
    public int quantidadeLojasPorTipo(String tipoDeLoja){
        int total = 0;
        switch (tipoDeLoja) {
            case "Cosmético":
                for (int i = 0; i < lojas.length; i++){
                    if (lojas[i] instanceof Cosmetico)
                        total++;}
                break;
            case "Vestuário":
                for (int i = 0; i < lojas.length; i++){
                    if (lojas[i] instanceof Vestuario)
                        total++;}
                break;
            case "Bijuteria":
                for (int i = 0; i < lojas.length; i++){
                    if (lojas[i] instanceof Bijuteria)
                        total++;}
                break;
            case "Alimentacao":
                for (int i = 0; i < lojas.length; i++){
                    if (lojas[i] instanceof Alimentacao)
                    total++;}
                break;
            case "Informática":
                for (int i = 0; i < lojas.length; i++){
                    if (lojas[i] instanceof Informatica)
                        total++;}
                break;
            default: total = -1;        
    
        }
        return total;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica nomeDaLojaInf = null;
        double maiorValor = 0;
        for (int i=0;i <lojas.length;i++)
            if(lojas[i] instanceof Informatica && (((Informatica)lojas[i]).getSeguroEletronicos() > maiorValor)){
             nomeDaLojaInf = (Informatica)lojas[i];
             maiorValor = nomeDaLojaInf.getSeguroEletronicos();
        }
        return nomeDaLojaInf;
    }
}
