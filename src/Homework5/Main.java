package Homework5;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"run", "eat", "sleep"};
        String[][] schedule = {{"Sunday", "Code"}, {"Monday", "Code"}};

        Human mother = new Human("Katy", "william", 1968, 100, schedule);
        Human father = new Human("Edward", "Johnson", 1956, 100, schedule);
        Pet pet = new Pet("dog", "Ildirim", 3, 100, habits);
        Human child = new Human("Steven", "Mattson", 1993, 100, schedule);

        Family family = new Family(mother, father, 1);
        family.addChild(child);
        System.out.println(family.toString() + "\n");
        System.out.println(pet.toString() + "\n");
        System.out.println(child.toString());
    }
}
