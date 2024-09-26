
import java.util.Scanner;

public class Demo {


      public static void main(String[] args) {


        Shop s1 = new Shop();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.printf("Enter 1 to add Product\nEnter 2 to view items\nEnter 0 to exit ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                s1.addProduct();
                break;

                case 2:
                s1.viewProducts();
                break;

                case 3:
                s1.sellProduct();
                break;
    
                default:
                System.exit(0);
                break;

            }

        }
      

      }

  }
  


  
  

