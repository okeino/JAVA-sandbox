package com.okeino2;

public class Main {

    public static void main(String[] args) {


        ITelephone kinoPhone;
        kinoPhone = new DeskPhone(7654321);
        kinoPhone.powerOn();
        kinoPhone.callPhone(7654321);
        kinoPhone.answer();

        kinoPhone = new MobilePhone(2345666);
        kinoPhone.powerOn();
        kinoPhone.callPhone(2345666);
        kinoPhone.answer();
    }
}
