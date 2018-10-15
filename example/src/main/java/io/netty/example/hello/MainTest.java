package io.netty.example.hello;

/**
 * @author Andy
 * @description
 */
public class MainTest {

    public static void main(String[] args) {
        GiftSubject subject = new GiftSubject();
        RankObserver rankObserver = new RankObserver();
        RecordObserver recordObserver = new RecordObserver();

        subject.addObserver(rankObserver);
        subject.addObserver(recordObserver);


        subject.setGiftNum(10L);
        subject.notifyObservers(subject.getGiftNum());

        subject.setGiftNum(20L);
        subject.notifyObservers(subject.getGiftNum());
    }
}
