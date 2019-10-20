package HW4;

public class Main {
    public static void main(String[] args) {

    String[] habits = {"run", "eat", "sleep"};
    String [][] schedule = {{"Sunday","Code"},{"Monday","Code"}};

    Human mother = new Human("Katy", "William", 1968);
    Human father = new Human("Billie", "Watterson", 1956);
    Pet pet = new Pet("dog","Ildirim",3,100, habits);
    Human child = new Human("Orkhan","Baylarli",1993,120,pet,mother,father,schedule);

    System.out.println(pet.toString());
    System.out.println(child.toString());

}
}