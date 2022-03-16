import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.*;
class CafeUtil{

    public int getStreakGoal(int numWeeks){
        int sum=0;
        for ( int i = 1; i <= numWeeks;i++){
            sum+=i;
        }
        return sum;
    }

    public double getOrderTotal (double[] prices){
        float sum=0;
        for(int i=0;i<prices.length;i++){
            sum+=prices[i];
        }
        return sum;
    }

    public void displayMenu( ArrayList<String> menuItems ){
        
        for( int i=0; i< menuItems.size(); i++ ){
            System.out.println ( i + " " + menuItems.get(i) );
        }
    }

    public void addCustomer( ArrayList<String> customers ){
        System.out.println("Porfavor,ingresa tu nombre:");
        String userName=System.console().readLine();
        System.out.println("!Hola," + userName);
        System.out.println("Hay"+ " " + customers.size()+ " " + "personas frente a ti");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChar(String product, double price, int maxQuantity){
        System.out.println(product);
        if(maxQuantity<3){
            for (int i=1;i<=maxQuantity;i++){
                price*=i;
                System.out.println( i + "-" + "$"+ price );
            }
        }else{
            for(int i =0;i<maxQuantity;i++){
                price -= 400*i;
                System.out.println(i + "-"+"$"+price);
            }
        }
        
    }

    public boolean displayMenu(ArrayList<String>menuItems,ArrayList<Double>prices){
        if(menuItems.size()==prices.size()){
            for(int i = 0; i<menuItems.size() ; i++){
                for( int j=0; j<prices.size() ; j++){
                    System.out.println( i + " " + menuItems.get(i) + "--" + "$" + prices.get(j));
                }
            }
        }
            return false;
        
    }

    public void addCustomer1( ArrayList<String> customers1){
        String intento = "q";
        while( true ){
            System.out.println("Porfavor,ingresa los nombres,cuando termines, presiona q");
            String userName=System.console().readLine();
            customers1.add(userName);
            System.out.println(customers1);
            if(userName.equals(intento)){
                break;
            }
        }
    }


}
