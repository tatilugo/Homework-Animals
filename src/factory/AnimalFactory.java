package factory;

import Animales.Animals;
import Animales.Birds.Duck;
import Animales.Pets.Cat;
import Animales.Pets.Dog;
import DataGeneral.AnimalTypeData;

public class AnimalFactory {
    public Animals create(AnimalTypeData AnimalTypeData) {
        switch (AnimalTypeData) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case DUCK:
                return new Duck();
        }
        return null;
    }
}
