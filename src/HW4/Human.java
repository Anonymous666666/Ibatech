package HW4;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule = new String[7][1];

    //CONSTRUCTORS
    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    //METHODS
    public void greetPet(){
        System.out.printf("Hello, %s", pet.getNickname());
    }

    public void describePet(){
        String slyness;
        if(pet.getTrickLevel() > 50) slyness = "very sly";
        else slyness = "almost not sly";

        System.out.printf("I have a %s, he is %d years old, he is %s", pet.getSpecies(), pet.getAge(), slyness);
    }

    @Override
    public String toString() {
        return String.format("Human" + "{" + "name" + "=" +
                this.name + ", " + "surname" + "=" +
                this.surname + ", " + "year" + "=" +
                this.year + ", " + "iq" + "=" +
                this.iq + ", " + "pet" + "=" +
                pet.toString() + ", " + "mother" + "=" +
                this.mother.name + " " + this.mother.surname + ", " + "father" + "=" +
                this.father.name + " " + this.father.surname + ", " + "schedule" + "=" +
                this.schedule() + "}");
    }

    public String schedule(){
        String s = "";
        for (int i = 0; i < schedule.length; i++) {
            s += "{";
            s += schedule[i][0];
            s += "<--->";
            s += schedule[i][1];
            s += "}";
        }
        return s;
    }

}
