package Entidades;

public class Produtos {

   private String nome;

    private Double preco;

    private Double valorTotal;

    private int quantidade;

    private static int totalDeProdutos;
    private Object produto;

    public Produtos( String nome, Double preco, int quantidade ) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade= quantidade;
        Produtos.totalDeProdutos++;

    }
    public String getNome(){
        return this.nome;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public  double getValorTotal(){
        return this.valorTotal;
    }



    public void adicionarProduto( int numero ) {
        totalDeProdutos += numero;
    }



    public void valorTotalEstoque() {
        this.quantidade += quantidade;
        this.valorTotal= quantidade * this.preco;
    }
    public String removerProduto ( int numero){
        if (this.quantidade >= numero){
            this.quantidade -= numero;
            this.valorTotal = quantidade * this.preco;
        } else {
            System.out.println("Não foi possivel remover essa quantidade de produto, conferir estoque!");
        }


        return this.nome + ", por R$ " +
                this.preco + " cada, " +
                this.quantidade + " unidade(s) em estoque. Total de: R$ " +
                this.valorTotal;
    }
        }












