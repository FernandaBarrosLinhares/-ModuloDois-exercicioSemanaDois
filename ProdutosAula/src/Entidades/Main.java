package Entidades;

public class Main {
    private static Object quantidade;

    public static void main( String[] args ) {

        Produtos produto1= new Produtos("chaveiro", 25.0, 30);
        System.out.println("Total de" + produto1.getNome());

        produto1.adicionarProduto(2);

        produto1.removerProduto(3);

        System.out.println(produto1);

        Object quantidadeDeProdutos = quantidade;
        System.out.println("Foram removidos" + quantidade + " do estoque, valor atual é "+ quantidade);
        




}}