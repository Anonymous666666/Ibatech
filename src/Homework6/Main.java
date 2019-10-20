package Homework6;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"run", "eat", "sleep"};
        String [][] schedule = {{DayofWeek.Sunday.name(),"Code"},{DayofWeek.Monday.name(),"Code"}};

        Human mother = new Human("Katerina", "Snowden", 1968,100,schedule);
        Human father = new Human("Edward", "Snowden", 1956,100,schedule);
        Pet pet = new Pet(Species.Dog,"Alabash",3,100, habits);
        Human child = new Human("Steve","Snowden",1993,100,schedule);

        Family family = new Family(mother, father, 1);
        family.addChild(child);
        System.out.println(family.toString() + "\n");
        System.out.println(pet.toString() + "\n");
        System.out.println(child.toString());
    }
}
