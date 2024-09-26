
import java.util.Scanner;

public class Shop {


    Product items[] = new Product[10];
    private static int count = 0;
    private static int revenue = 0;

    Product p;

    Scanner sc = new Scanner(System.in);

    public void addProduct(){

        System.out.println("Enter the product details :- ");

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        items[count++]  = new Product(name, price, quantity);

    

        System.out.println("Product Added .. ");



    }

    public void sellProduct(){

        System.out.print("Enter the product id: ");
        String id = sc.nextLine();

        for(int i = 0;i<count;i++){

            if(id.equals(items[i].getProductId())){
                System.out.println("Product Sell ");
                items[i].setQuantity(items[i].getQuantity()-1);
            }

            else{
                System.out.println("Product not found");
            }

        }
        
    }

    public void viewProducts(){

        for(int i=0 ;i<count;i++){
            System.out.println(items[i]);
        }

    }

}
