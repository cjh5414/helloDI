package kr.ac.hansung.spring.di;

/**
 * Created by jihun on 2017. 1. 24..
 */
public class PetOwner {
    private AnimalType animal;

    public PetOwner(AnimalType animal) {
        this.animal = animal;
    }
    public void play() {
        animal.sound();
    }
}
