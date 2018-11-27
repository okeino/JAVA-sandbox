package com.okeino2;

/**
 * Created by okeinomcgowan on 15/05/2017.
 */
public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
