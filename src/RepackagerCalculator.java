/**
 * Created by janelle on 2017-03-21.
 */


public class RepackagerCalculator {

    double BASE_MARKUP = 1.05;
    double PERSON_MARKUP = 0.012;

    double PHARM_MARKUP = 0.075;
    double FOOD_MARKUP = 0.13;
    double ELEC_MARKUP = 0.02;


    public double calculateCost(double basePrice, double numOfWorkers, int isPharma, int isFood, int isElec) {
        if (numOfWorkers>0 || basePrice>0) {
            double otherMarkups = isPharma * PHARM_MARKUP + isFood * FOOD_MARKUP + isElec * ELEC_MARKUP;
            double finalprice = (basePrice * BASE_MARKUP) * (1 + numOfWorkers * PERSON_MARKUP + otherMarkups);
        }else{
            throw new IllegalArgumentException("You cannot have a negative amount of workers or negative Base Price");
        }
        return finalprice;
    }
}

