package com.company;

import java.util.HashMap;

abstract class ImageFunctions {
    HashMap<Integer, Integer> frequency = new HashMap<>();
    abstract int greyScale(int color) throws Exception;
    abstract int sepia(int color) throws Exception;
    abstract int inversion(int color) throws Exception;
    abstract int onlyRed(int color) throws Exception;
    abstract int onlyGreen(int color) throws Exception;
    abstract int onlyBlue(int color) throws Exception;
    abstract void fft(int color);
}
