package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataBase {

    public DataBase() {}

    /**
     * Serialization Input
     * @param file
     * @param x
     * @param y
     */
    public void serialization(String file, String x, String y){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("Input:\n\tX = "+x+"\n\tY = "+y);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serialization Output
     * @param file
     * @param ans
     */
    public void serialization(String file, String ans){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("Output:\n\tAnswer = " + ans);
            oos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
