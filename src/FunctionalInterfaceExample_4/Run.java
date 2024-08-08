package FunctionalInterfaceExample_4;

public class Run {
    public static void main(String[] args) { 
        // Özel bir işi gerçekleştirmek içinde functional interface kullanılabilir
        CustomFuncInterface customFunction = value -> System.out.println("Value: " + value);
        customFunction.doSomething("Ahmet");
    }
}
