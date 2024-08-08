package FunctionalInterfaceExample_1;

public class Run {
    public static void main(String[] args) {
        // Using a Supplier to generate a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        double randomNumber = randomNumberSupplier.get();
        System.out.println("Random Number: " + randomNumber);
    }
}
