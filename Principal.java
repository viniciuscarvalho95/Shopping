import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Shopping novoShopping = new Shopping("Shopping Vini",
                                 new Endereco("Rua A", "Alvorada", "RS", 
                                 "Brasil", "94853752", "333", "qd 2"), 2);
        Scanner entradaTxt = new Scanner(System.in);
        Scanner entradaNum = new Scanner(System.in);
        System.out.println("Digite para criar: \n[1]Loja | [2]Produto | [3]Sair");
        int menu = entradaNum.nextInt();
        while (true) {
            if (menu == 3){
                System.out.println("Saindo.");

                break;
            }
            switch (menu) {
                case 1: //criar loja
                    System.out.println("Criando loja");
 
                    System.out.println("Digite o nome da loja:");
                    String nomeLoja = entradaTxt.nextLine();
                    
                    System.out.println("Quantos funcionários?");
                    int quantidadeFuncionarios = entradaNum.nextInt();
                    System.out.println("Qual data de fundação da loja?");
                    System.out.println("Dia da fundação");
                    int dia = entradaNum.nextInt();
                    System.out.println("Mês da fundação");
                    int mes = entradaNum.nextInt();
                    System.out.println("Ano da fundação");
                    int ano = entradaNum.nextInt();
                    Data data = new Data(dia, mes, ano);
                    System.out.println("Quantos produtos há no estoque?");
                    int quantidadeProdutos = entradaNum.nextInt();
                    

                    Endereco enderecoLoja = new Endereco("Rua A", "Porto Alegre", "RS", "Brasil", "9480000", "1234", "Bloco B");

                    Loja novaLoja = new Loja(nomeLoja, quantidadeFuncionarios,enderecoLoja, data, quantidadeProdutos);
                    System.out.println("Loja Criada: ");
                    novoShopping.insereLoja(novaLoja);
                    System.out.println(novaLoja);

                    System.out.println("Deseja continuar?");
                    System.out.println("Digite para criar: \n[1]Loja | [2]Produto | [3]Sair");

                    menu = entradaNum.nextInt();
                    break;
                    
                    case 2: //cria produto

                    System.out.println("Digite o nome do produto: ");
                    String nomeDoProduto = entradaTxt.nextLine();
                    System.out.println("Preço");
                    double preco = entradaNum.nextDouble();
                    System.out.println("Validade");
                    System.out.println("Dia");
                    int diaProduto = entradaNum.nextInt();
                    System.out.println("Mês");
                    int mesProduto = entradaNum.nextInt();
                    System.out.println("Ano");
                    int anoProduto = entradaNum.nextInt();
                    Data dataDeValidade = new Data(diaProduto, mesProduto, anoProduto);
                    Produto novoProduto = new Produto(nomeDoProduto, preco, dataDeValidade);
                    System.out.println("Produto Criado");
                    System.out.println(novoProduto.toString());

                    if (novoProduto.estaVencido(new Data(20, 10, 2023)) == true){
                        System.out.println("PRODUTO VENCIDO");
                    } else System.out.println("PRODUTO NÃO VENCIDO");
                   
                    System.out.println("Deseja continuar?");
                    System.out.println("Digite para criar: \n[1]Loja | [2]Produto | [3]Sair");

                    menu = entradaNum.nextInt();
                    
                    break;
                default: //informa erro
                
                    System.out.println("Opção inválida");
                    System.out.println("Deseja continuar?");
                    menu = entradaNum.nextInt();                    
                }
            }
    entradaNum.close(); 
    entradaTxt.close();

    }
    }
