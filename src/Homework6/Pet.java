package Homework6;

import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = new String[3];

    //CONSTRUCTORS
    public Pet() {

    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    //METHODS
    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(String nickname){
        System.out.printf("Hello, owner. I am %s. I miss you!", nickname);
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return String.format(this.species+ "{" + "nickname" + "=" +
                this.nickname + ", " + "age" + "=" + this.age + ", " + "trickLevel" + "=" +
                this.trickLevel + ", " + "habits" + "=" + Arrays.toString(this.habits) + ", " + "characteristics [ " +
                species.toString() + " ] " + "}");
    }

    public String getNickname() {
        return nickname;
    }

    public Species getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }
}
