/**
 * Created by janelle on 2017-03-21.
 */
package JanelleRepackagerCalculator;

import JanelleRepackagerCalculator.RepackagerCalculator;


public class MainClass {

    public static void main(String[] args){
        RepackagerCalculator Calculators = new RepackagerCalculator();
        double price=Calculators.calculateCost(1299.99,3,0,1,0);
        System.out.println("The final price for the project" + price);

        double price2=Calculators.calculateCost(5432,1,1,0,0);
        System.out.println("The final price for the project" + price2);

        double price3=Calculators.calculateCost(12456.95,4,0,0,0);
        System.out.println("The final price for the project" + price3);


    }
}
