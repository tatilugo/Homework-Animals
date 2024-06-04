import Animales.Animals;
import DataGeneral.AnimalTypeData;
import DataGeneral.ColorsData;
import DataGeneral.CommandsData;
import factory.AnimalFactory;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        List<Animals> animals = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        CommandsData[] commandsData = CommandsData.values();
        String[] commandsStr = new String[commandsData.length];
        for (int i = 0; i < commandsData.length; i++) {
            commandsStr[i] = commandsData[i].name().toLowerCase();
        }

        while (true) {
            System.out.printf("Введите одну из команд: %s\n", String.join("/", commandsStr));

            String commandStr = scanner.next().trim().toUpperCase();
            boolean isCommandExist = false;
            for (CommandsData command : commandsData) {
                if (command.name().equals(commandStr)) {
                    isCommandExist = true;
                    break;
                }

            }


            if (!isCommandExist) {
                System.out.println("Вы ввели нерпавильную команду. Введите заново.");
                continue;
            }
            CommandsData userCommandData = CommandsData.valueOf(commandStr);

            switch (userCommandData) {
                case ADD:
                    AnimalFactory animalFactory = new AnimalFactory();

                    AnimalTypeData[] animalTypeData = AnimalTypeData.values();
                    String[] animalTypeDataStr = new String[animalTypeData.length];
                    for (int i = 0; i < animalTypeData.length; i++) {
                        animalTypeDataStr[i] = animalTypeData[i].name().toLowerCase();
                    }

                    while (true) {
                        System.out.printf("Введите одного из животных: %s\n", String.join("/", commandsStr));

                        String animalTypeStr = scanner.next().trim().toUpperCase();
                        boolean isAnimalTypeExist = false;
                        for (CommandsData command : commandsData) {
                            if (command.name().equals(commandStr)) {
                                isAnimalTypeExist = true;
                                break;
                            }
                            if (!isAnimalTypeExist) {
                                System.out.println("Вы ввели несуществующего животного. Введите заново.");
                                continue;
                            }
                            String userAnimalStr = scanner.next().trim().toUpperCase();

                            AnimalTypeData animalTypeData = AnimalTypeData.valueOf(userAnimalStr);
                            Animal userAnimal = animalFactory.create(animalTypeData);

                                System.out.println("Введите имя животного");
                                String name = scanner.next().trim();
                                userAnimal.setName(name);

                            System.out.println("Введите возраст животного");


                                public static void checkAge(int age) {
                                    if  (age == 60 || (age<60 && age>=0))
                                        System.out.println("");
                                    else if (age>60 || age<0);}
                                System.out.println("Животного такого возраста нет.");
                                int age = Integer.parseInt(scanner.next());
                                userAnimal.setAge(age);


                            System.out.println("Введите вес животного.");
                            int weight = Integer.parseInt(scanner.next());
                            userAnimal.setWeight(weight);

                            System.out.println("Введите цвет животного.");
                            ColorsData[] colorsData = ColorData.values();
                            String[] colorsDataStr = new String[colorsData.length];
                            for (int i = 0; i < colorsData.length; i++) {
                                colorsDataStr[i] = colorsData[i].name().toLowerCase();
                            }

                            while (true) {
                                System.out.printf("Введите цвет жтвотного: %s\n", String.join("/", commandsStr));

                                String colorsDataStr = scanner.next().trim().toUpperCase();
                                boolean colorsDataExist = false;
                                for (CommandsData command : commandsData) {
                                    if (command.name().equals(commandStr)) {
                                        colorsDataExist= true;
                                        break;
                                    }
                                    if (!colorsDataExist) {
                                        System.out.println("Вы ввели несуществующий цвет. Введите заново.");
                                        continue;
                                    }
                                    String userColorsStr = scanner.next().trim();
                                    ColorsData colorsData = ColorsData.valueOf();
                                    userAnimal.setColor(colorsData);


                                break;




                            case LIST:
                                for (Animals animal : animals) {
                                    System.out.println(animal.toString());
                                }

                                break;


                            case EXIT:
                                System.exit(0);

                        }
                    }
            }
        }



