public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Construtor de data
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        verificaDiaDoMes();
        ano = a;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
        return true;
    } else return false;
    }
    
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public void verificaDiaDoMes(){
        switch(mes) {
            case 1: //janeiro
             if (dia >= 1 && dia <= 31)
                mes = 1;
             break;
            case 2: //fevereiro
             if ((dia >= 1 && dia <=29) && (verificaAnoBissexto() == true)){
                mes = 2;
             } else if ((dia >= 1 && dia <= 28) && (verificaAnoBissexto() == false)){
                mes = 2;
             } else {
                System.out.println("Erro!");
             }
             break;
            case 3: //março
             if (dia >= 1 && dia <= 31)
                mes = 3;
             break;
            case 4: //abril
             if (dia >= 1 && dia <= 30)
             mes = 4;
             break;
            case 5: //maio
             if (dia >= 1 && dia <= 31)
             mes = 5;
             break;
            case 6: //junho
             if (dia >= 1 && dia <= 30)
             mes = 6;
             break;
            case 7: //julho
             if (dia >= 1 && dia <= 31)
             mes = 7;
             break;
            case 8: //agosto
             if (dia >= 1 && dia <= 31)
             mes = 8; 
             break;
            case 9: //setembro
             if (dia >= 1 && dia <= 30)
             mes = 9;
             break;
            case 10: //outubro
             if (dia >= 1 && dia <= 31)
             mes = 10;
             break;
            case 11: //novembro
             if (dia >= 1 && dia <= 30)
             mes = 11;
             break;
            case 12: //dezembro
             if (dia >= 1 && dia <= 31)
             mes = 12;
             break;
            default:
                dia = 1;
                mes = 1;
                ano = 2000;
            System.out.println("Data inválida");

        }
    }


}
