package FunctionalInterfaceExample_3;

@FunctionalInterface 
interface Predicate<T> {
    boolean test(T t);
}