package kr.ac.hansung.spring.di;

/**
 * Created by jihun on 2017. 1. 23..
 */
public class Dog implements AnimalType {
    private String myName;

    public void setMyName(String myName) {
        this.myName = myName;
    }

    @Override
    public void sound() {
        System.out.println("Dog name=" + myName + ": " + "Bow Wow");
    }
}
