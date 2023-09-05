package com.andres.hanged.app;

import com.andres.hanged.domain.Hanged;
import com.andres.hanged.exceptions.InvalidFormatException;

public class HangedApp {
    public static void main(String[] args) {
        Hanged hanged = new Hanged();

        try{
            hanged.play();
        } catch (InvalidFormatException exception){
            exception.printStackTrace();
            System.out.println("Enter a valid value...");
        }
    }
}
