package application;

import entities.Product;

import java.util.Scanner;


public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cadastrar produto \n2 - Adicionar stock de produto \n3 - remover produto do estoque \n4 - Ver dados dos produtos cadastrados");
        int opcao = sc.nextInt();

        Product product = new Product();

    switch (opcao) {
        case 1:


            System.out.println("Cadastrar novo produto");
            System.out.print("Nome: ");
            product.name = sc.nextLine();
            System.out.print("Preço: ");
            product.price = sc.nextDouble();
            System.out.print("Quantidade em estoque: ");
            product.quantity = sc.nextInt();
            break;

        case 2:
            System.out.println();
            System.out.println("Digite o número de produtos adicionados em estoque: ");
            int quantity = sc.nextInt();
            product.addProducts(quantity);
            break;

        case 3:
            System.out.print("digite o numero de produtos removidos do estoque: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);
            break;

        case 4:
            System.out.println();
            System.out.println("Dados atualizados: " + product);
            System.out.println();
            break;

    }






    }
}
