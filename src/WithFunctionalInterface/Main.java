package WithFunctionalInterface;

public class Main {       
    public static void main(String[] args) {

        /*
          Calculate interface içinde 4 ayrı işlem için ayrı ayrı 4 metod tanımı yapılması ve implement edilen sınıfta
          override metodlarının yazılması gerekiyordu.
          Lambda func. ekstra kod yazmaya gerek kalmadan daha anlamlı, okunaklı ve sade kodlamaya olanak sağlar.
        * */

        // Using Lambda Expression for addition
        Calculator topla = (a, b) -> a + b;
        int resultToplama = topla.calculate(50, 5);
        System.out.println("Toplama Hesapla: " + resultToplama);

        // Çıkarma işlemi için lambda
        Calculator cikar = (a, b) -> a - b;
        int resultCikarma = cikar.calculate(50, 5);
        System.out.println("Cikarma Hesapla: " + resultCikarma);

        // Çarpma işlemi için lambda
        Calculator carp = (a, b) -> a * b;
        int resultCarpma = carp.calculate(50, 5);
        System.out.println("Carpma Hesapla: " + resultCarpma);

        // Bolme işlemi için lambda
        Calculator bol = (a, b) -> a / b;
        int resultBolme = bol.calculate(50, 5);
        System.out.println("Bolme Hesapla: " +  resultBolme);

    }
}