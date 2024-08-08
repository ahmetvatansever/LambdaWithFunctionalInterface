package FunctionalInterfaceExample_2;

@FunctionalInterface
interface Function<T, R> {
    R apply(T t); 
}
