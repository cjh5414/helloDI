package kr.ac.hansung.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by jihun on 2017. 1. 24..
 */
public class PetOwner {
    // @Autowired  // wiring by type
    // @Qualifier(value="qf_cat")
    @Resource(name="cat")      // wiring by name
    private AnimalType animal;

    public void play() {
        animal.sound();
    }
}
