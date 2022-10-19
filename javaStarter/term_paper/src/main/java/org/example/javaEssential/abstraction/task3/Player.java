package org.example.javaEssential.abstraction.task3;

public class Player implements Playable,Recodable{
    @Override
    public void play() {
        System.out.println("music is playing");
    }

    @Override
    public void record() {
        System.out.println("music is recording");
    }

    @Override
    public void pause() {
        System.out.println("music is pause");
    }

    @Override
    public void stop() {
        System.out.println("music is stop");
    }
}
