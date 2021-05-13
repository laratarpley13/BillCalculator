public class Calculator {
    public static void main(String[] args) {
        System.out.println("The Bill Calculator");
        System.out.println("-------------------");
        System.out.println();

        int numberOfPersons = 4;

        double taxPercent = 8;
        double tipPercent = 15;

        double personOneAppetizerCost = 9.99;
        double personOneMainCost = 23.99;
        double personOneDessertCost = 10.29;
        double personOneDrinkCost = 4.25;

        double personTwoAppetizerCost = 12.99;
        double personTwoMainCost = 18.99;
        double personTwoDessertCost = 9.99;
        double personTwoDrinkCost = 4.25;

        double personThreeAppetizerCost = 10.49;
        double personThreeMainCost = 26.79;
        double personThreeDessertCost = 10.29;
        double personThreeDrinkCost = 3.75;

        double personFourAppetizerCost = 13.79;
        double personFourMainCost = 25.99;
        double personFourDessertCost = 4.49;
        double personFourDrinkCost = 3.75;

        String personOneName = "Adeline";
        String personOneAppetizer = "Stuffed Ziti Fritta";
        String personOneMain = "Shrimp Scampi";
        String personOneDessert = "Sicilian Cheesecake";
        String personOneDrink = "Raspberry Lemonade x 2";

        String personTwoName = "Brixton";
        String personTwoAppetizer = "Lasagna Fritta";
        String personTwoMain = "Fettuccine Alfredo";
        String personTwoDessert = "Lemon Cream Cake";
        String personTwoDrink = "Mango-Strawberry Iced Tea";

        String personThreeName = "Cora";
        String personThreeAppetizer = "Fried Mozzarella";
        String personThreeMain = "Tour of Italy";
        String personThreeDessert = "Zeppoli";
        String personThreeDrink = "Fresh Brewed Iced Tea";

        String personFourName = "Dean";
        String personFourAppetizer = "Classic Shrimp Scampi Fritta";
        String personFourMain = "Seafood Alfredo";
        String personFourDessert = "Dolcini";
        String personFourDrink = "Coke x 2";

        boolean serviceWasGood = false;
        boolean splitEvenly = false;

        double personOneSubTotal = personOneAppetizerCost + personOneMainCost + personOneDessertCost + (personOneDrinkCost * 2);
        double personTwoSubTotal = personTwoAppetizerCost + personTwoMainCost + personTwoDessertCost + personTwoDrinkCost;
        double personThreeSubTotal = personThreeAppetizerCost + personThreeMainCost + personThreeDessertCost + personThreeDrinkCost;
        double personFourSubTotal = personFourAppetizerCost + personFourMainCost + personFourDessertCost + (personFourDrinkCost * 2);

        //Calculate tax
        double taxAmount = taxPercent / 100;
        double personOneTax = taxAmount * personOneSubTotal;
        double personTwoTax = taxAmount * personTwoSubTotal;
        double personThreeTax = taxAmount * personThreeSubTotal;
        double personFourTax = taxAmount * personFourSubTotal;

        //Calculate tip
        double personOneTip = 0;
        double personTwoTip = 0;
        double personThreeTip = 0;
        double personFourTip = 0;

        //Calculate meal total
        double mealSubTotal = personOneSubTotal + personTwoSubTotal + personThreeSubTotal + personFourSubTotal;
        double mealTax = taxAmount * mealSubTotal;
        double mealTip = 0;
        if( serviceWasGood ) {
            double tipAmount = tipPercent / 100;
            mealTip = tipAmount * mealSubTotal;
            personOneTip = tipAmount * personOneSubTotal;
            personTwoTip = tipAmount * personTwoSubTotal;
            personThreeTip = tipAmount * personThreeSubTotal;
            personFourTip = tipAmount * personFourSubTotal;

        }

        //calculate if split evenly
        double mealTotal = mealSubTotal + mealTax + mealTip;
        double evenCostPerPerson = mealTotal / numberOfPersons;

        //Calculate if not split evenly
        double personOneTotal = personOneSubTotal + personOneTax + personOneTip;
        double personTwoTotal = personTwoSubTotal + personTwoTax + personTwoTip;
        double personThreeTotal = personThreeSubTotal + personThreeTax + personThreeTip;
        double personFourTotal = personFourSubTotal + personFourTax + personFourTip;

        //Calculate differences
        double diffPersonOne = Math.abs(personOneTotal - evenCostPerPerson);
        double diffPersonTwo = Math.abs(personTwoTotal - evenCostPerPerson);
        double diffPersonThree = Math.abs(personThreeTotal - evenCostPerPerson);
        double diffPersonFour = Math.abs(personFourTotal - evenCostPerPerson);

        if(serviceWasGood) {
            System.out.printf("The service was good, a $%.2f tip will be paid.\n", mealTip);
        } else {
            System.out.println("The service was bad, no tip will be paid.");
        }
        System.out.println();
        System.out.printf("%s had\n", personOneName);
        System.out.printf("%s\t\t$%.2f\n", personOneAppetizer, personOneAppetizerCost);
        System.out.printf("%s\t\t$%.2f\n", personOneMain, personOneMainCost);
        System.out.printf("%s\t\t$%.2f\n", personOneDessert, personOneDessertCost);
        System.out.printf("%s\t\t$%.2f\n", personOneDrink, personOneDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n", personOneName, personOneSubTotal);
        System.out.println();

        System.out.printf("%s had\n", personTwoName);
        System.out.printf("%s\t\t$%.2f\n", personTwoAppetizer, personTwoAppetizerCost);
        System.out.printf("%s\t\t$%.2f\n", personTwoMain, personTwoMainCost);
        System.out.printf("%s\t\t$%.2f\n", personTwoDessert, personTwoDessertCost);
        System.out.printf("%s\t\t$%.2f\n", personTwoDrink, personTwoDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n", personTwoName, personTwoSubTotal);
        System.out.println();

        System.out.printf("%s had\n", personThreeName);
        System.out.printf("%s\t\t$%.2f\n", personThreeAppetizer, personThreeAppetizerCost);
        System.out.printf("%s\t\t$%.2f\n", personThreeMain, personThreeMainCost);
        System.out.printf("%s\t\t$%.2f\n", personThreeDessert, personThreeDessertCost);
        System.out.printf("%s\t\t$%.2f\n", personThreeDrink, personThreeDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n", personThreeName, personThreeSubTotal);
        System.out.println();

        System.out.printf("%s had\n", personFourName);
        System.out.printf("%s\t\t$%.2f\n", personFourAppetizer, personFourAppetizerCost);
        System.out.printf("%s\t\t$%.2f\n", personFourMain, personFourMainCost);
        System.out.printf("%s\t\t$%.2f\n", personFourDessert, personFourDessertCost);
        System.out.printf("%s\t\t$%.2f\n", personFourDrink, personFourDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n", personFourName, personFourSubTotal);
        System.out.println();

        System.out.printf("Total cost of meal: $%.2f (including $%.2f tax and $%.2f tip)\n", mealTotal, mealTax, mealTip);
        System.out.println();
        System.out.printf("Amount each person pays if split evenly in %d is $%.2f\n", numberOfPersons, evenCostPerPerson);
        System.out.println();

        splitEvenly = (diffPersonOne < 5) && (diffPersonTwo < 5) && (diffPersonThree < 5) && (diffPersonFour < 5);
        if(splitEvenly) {
            System.out.println("The bill should be split evenly!");
        } else {
            System.out.println("Each person should pay for their own meal.");
            System.out.println();
            System.out.println("If not split evenly:");
            System.out.printf("%s's meal costs: $%.2f\n", personOneName, personOneTotal);
            System.out.printf("%s's meal costs: $%.2f\n", personTwoName, personTwoTotal);
            System.out.printf("%s's meal costs: $%.2f\n", personThreeName, personThreeTotal);
            System.out.printf("%s's meal costs: $%.2f\n", personFourName, personFourTotal);
        }

    }
}