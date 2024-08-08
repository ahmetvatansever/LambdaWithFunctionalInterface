package FunctionalInterfaceExample_2;

public class Run { 
    public static void main(String[] args) {
        //Karakter sayısını lambda ile bulmak için
        Function<String, Integer> stringLengthFunction = s -> s.length();
        int length = stringLengthFunction.apply("Kaç karakter?");
        System.out.println("Karakter Sayısı: " + length);
    }
}
