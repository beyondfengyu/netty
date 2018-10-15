package io.netty.example.hello;

import java.util.Observable;

/**
 * @author Andy
 * @description
 */
public class GiftSubject extends Observable {

    private Long giftNum;



    public Long getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Long giftNum) {
        this.giftNum = giftNum;
        setChanged();
    }
}
