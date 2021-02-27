import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalCreator {

    public static Map<AnimalType, Supplier<Animal>> suppliersByType = Map.of(
            AnimalType.CAT, Cat::new,
            AnimalType.DOG, Dog::new,
            AnimalType.DUCK,Duck::new
    );

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        AnimalType animalType = AnimalType.valueOf(input);
        Animal animal = suppliersByType.get(animalType).get();
        System.out.println(animal);

    }
}

class Animal{

}

class Cat extends Animal{

}

class Dog extends Animal{

}

class Duck extends Animal{

}

enum AnimalType{
    DUCK,
    CAT,
    DOG,
}