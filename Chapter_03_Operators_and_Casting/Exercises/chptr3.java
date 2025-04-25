public class chptr3 {

    public static void calculateAverageWeight(double weight1, double weight2){
        double averageWeight = (weight1 + weight2) / 2; // Weight in Kilograms
        System.out.println("The average weight of the two dinosaurs is: " + averageWeight + " kg");
    }

    public static void properNutrition(double weightInKg) {
        String meal1 = "beef";
        String meal2 = "dry hay";
        double foodRequired = (weightInKg / 1000) * 200; // 200 kg of food per tonne

        System.out.printf("The dinosaurs can be fed %s if they're carnivores, or %s if they're herbivores.%n", meal1, meal2);
        System.out.printf("For a dinosaur weighing %.2f kg, they should be fed approximately %.2f kg of food.%n", weightInKg, foodRequired);
    }

    public static void checkLeapYear(int year){
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        ? year + " is a leap year."
                        : year + " is not a leap year.";
        System.out.println(result);
    }

    public static void maxCapacity(int capacity){
        
    }

    public static void main(String[] args){
        chptr3.calculateAverageWeight(7000, 9000); //Example weight in kilograms
        chptr3.properNutrition(8000); // Example weight in kilograms
        chptr3.checkLeapYear(2025);
        chptr3.maxCapacity(0);;
    }
}
