package ro.fastrackit.homework7;

import ro.fastrackit.classroom.Human;

public class Box <T extends Human> {

    T theObject;

    public Box(T theObject) {
        this.theObject = theObject;
    }

    public T getTheObject() {
        return theObject;
    }
}
