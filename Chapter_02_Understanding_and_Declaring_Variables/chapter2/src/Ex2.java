public class Ex2 {
    public static void main(String[] args) {
        String breed = "Velociraptor"; // variable declaration
        double height, weight, length, safety; // variable declaration
        height = 3.63; // in meters
        length = 5.99; //in meters
        weight = 850; // in kilograms

        String name, diet;// Exercise 2 variable declaration
        int age = 4; // Exercise 2 variable declaration
        name = "Felicia"; // Exercise 2 variable declaration
        diet = "carnivore"; // Exercise 2 variable declaration

        int max_visitors = 295; // Exercise 3 variable declaration

        String employee_name = "Kendrick";// Exercise 4 variable declaration
        int employee_age =  26; // Exercise 4 variable declaration

        int no_of_dinosaurs = 15;

        safety = 8.2; // exercise 6 variable declaration

        char firstLetter = breed.charAt(0);

        System.out.println("This is the " + breed + ", and they usually stand at " + height + "m tall on two legs.");
        System.out.println("They can grow as long as " + length + "m long, from snout to tail, and weigh about " + weight + "kg as adults." ); // prints variables and string output

        System.out.println("Her name is " + name + ", and she's a " + age + "yr old " + diet + ".");// Exercise 2 output
        
        System.out.println("\nThere's a maximum of " + max_visitors + " people allowed in Mesozoic Eden. As advised by the fire department."); // Exercise 3 output

        System.out.println("My name is " + employee_name + " and I will be your tour guide for today. Although I look young, I'm actually " + employee_age + "."); // Exercise 4 output

        System.out.println("There are currently " + no_of_dinosaurs + " dinosaurs currently in the park."); // Exercise 5 output

        System.out.println("\nSafety is our priority. We maintain a safety rating scale of " + safety + " to ensure our standards."); // Exercise 6 output

        System.out.println("Dinosaur info: Name - " + name + ", Age - " + age + " years, Diet - " + diet + ".");

        System.out.println("The first letter of the dinosaur species is: " + firstLetter);

    }
}
