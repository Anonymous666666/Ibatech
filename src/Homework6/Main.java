package Homework6;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"run", "eat", "sleep"};
        String [][] schedule = {{DayofWeek.Sunday.name(),"Code"},{DayofWeek.Monday.name(),"Code"}};

        Human mother = new Human("Katy", "William", 1988,100,schedule);
        Human father = new Human("Billie", "Wattorson", 1979,100,schedule);
        Pet pet = new Pet(Species.Dog,"Ildirim",3,100, habits);
        Human child = new Human("Steven","Johnson",1965,100,schedule);

        Family family = new Family(mother, father, 1);
        family.addChild(child);
        System.out.println(family.toString() + "\n");
        System.out.println(pet.toString() + "\n");
        System.out.println(child.toString());
    }
}
