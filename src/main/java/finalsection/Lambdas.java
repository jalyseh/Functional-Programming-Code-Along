package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Integer number = null;
        int counter = 0;

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            //name.toUpperCase();
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

       String upperCasedName = upperCaseName.apply("Alex", 20);
        System.out.println(upperCasedName);
    }
    class Service {
        Consumer<String> blah = s -> {

        };
    }
}
