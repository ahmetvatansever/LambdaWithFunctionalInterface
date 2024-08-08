package FunctionalInterfaceExample_3;

public class Run {
    public static void main(String[] args) { 
        // Sayının input değerine bölümünden kalan olup olmadığını kontrol etmek için lambda
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        boolean isEven = isEvenPredicate.test(10);
        System.out.println("Kalan var mı: " + isEven);
    }
}
