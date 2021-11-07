package com.company;


public class Main {
    public static void main(String[] args) throws Exception {
        RgbMaster rbgMaster = new RgbMaster("in_image.jpeg");
        ImageFunctionsImpl imageFunc = new ImageFunctionsImpl();
        rbgMaster.changeImage(imageFunc::onlyRed);
        rbgMaster.changeImage(imageFunc::onlyBlue);
        rbgMaster.changeImage(imageFunc::onlyGreen);
        rbgMaster.changeImage(imageFunc::greyScale);
        rbgMaster.changeImage(imageFunc::sepia);
        rbgMaster.changeImage(imageFunc::inversion);
        rbgMaster.iterateInImage(imageFunc::fft);
        System.out.println(imageFunc.frequency);
        rbgMaster.save("out_image.png");
    }
}
