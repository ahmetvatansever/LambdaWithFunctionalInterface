package WithInterface;
public class Main {     
    public static void main(String[] args) {
        Calculator hesaplaCalculator = new Addition();
        int resultToplama = hesaplaCalculator.toplamaHesapla(50, 5);
        System.out.println("Toplama Hesapla: " + resultToplama);

        int resultCikarma = hesaplaCalculator.cikarmaHesapla(50, 5);
        System.out.println("Cikarma Hesapla: " + resultCikarma);

        int resultCarpma = hesaplaCalculator.carpmaHesapla(50, 5);
        System.out.println("Carpma Hesapla: " + resultCarpma);

        int resultBolme = hesaplaCalculator.bolmeHesapla(50, 5);
        System.out.println("Bolme Hesapla: " + resultBolme);
    }
}