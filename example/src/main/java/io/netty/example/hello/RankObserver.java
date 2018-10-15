package io.netty.example.hello;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Andy
 * @description
 */
public class RankObserver implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof GiftSubject) {
            System.out.println("rank update: " + arg);
        }
    }
}
