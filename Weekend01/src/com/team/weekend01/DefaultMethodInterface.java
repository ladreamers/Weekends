package com.team.weekend01;

public interface DefaultMethodInterface {
    public void move();
    
    // methods can have a body in the interface.. Because of this, newly created methods 
    // won't break current implementations
    default void scare() {
        System.out.println("boo!");
    }

}
