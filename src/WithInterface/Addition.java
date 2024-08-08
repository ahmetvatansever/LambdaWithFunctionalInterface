package WithInterface; 

public class Addition implements Calculator {
    @Override
    public int toplamaHesapla(int a, int b) {
        return a + b;
    }

    @Override
    public int cikarmaHesapla(int a, int b) {
        return a - b;
    }

    @Override
    public int carpmaHesapla(int a, int b) {
        return a * b;
    }

    @Override
    public int bolmeHesapla(int a, int b) {
        return a / b;
    }
}