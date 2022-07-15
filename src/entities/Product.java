package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; //comando this, Acessa o quantitity da classe objeto produto.
    }//soma o quantity de product com o quantity de addprocucts

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ". $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());

    }
}
