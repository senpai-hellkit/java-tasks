package com.company;

public class ImageFunctionsImpl extends ImageFunctions {
    int greyScale(int color) throws Exception {
        float[] pixels = RgbMaster.rgbIntToArray(color);
        float mean = (pixels[0] + pixels[1] + pixels[2]) / 3;
        return RgbMaster.rgbArrayToInt(new float[] {mean, mean, mean, pixels[3]});
    }

    int sepia(int color) throws Exception {
        float[] pixels = RgbMaster.rgbIntToArray(color);
        float[] anotherPixels = new float[4];
        float scale = (float) (.299 * pixels[0] + .587 * pixels[1] + .114 * pixels[2]);
        anotherPixels[0] = (float) ((scale > .8078) ? 1 : scale + .1922);
        anotherPixels[1] = (float) ((scale < .0549) ? 0 : scale - .0549);
        anotherPixels[2] = (float) ((scale < .2196) ? 0 : scale - .2196);
        anotherPixels[3] = pixels[3];
        return RgbMaster.rgbArrayToInt(anotherPixels);
    }

    int inversion(int color) throws Exception {
        float[] pixels = RgbMaster.rgbIntToArray(color);
        pixels[0] = 1 - pixels[0];
        pixels[1] = 1 - pixels[1];
        pixels[2] = 1 - pixels[2];
        return RgbMaster.rgbArrayToInt(pixels);
    }

    int onlyRed(int color) throws Exception {
        float[] pixels = RgbMaster.rgbIntToArray(color);
        pixels[1] = 0;
        pixels[2] = 0;
        return RgbMaster.rgbArrayToInt(pixels);
    }

    int onlyGreen(int color) throws Exception {
        float[] pixels = RgbMaster.rgbIntToArray(color);
        pixels[0] = 0;
        pixels[2] = 0;
        return RgbMaster.rgbArrayToInt(pixels);
    }

    int onlyBlue(int color) throws Exception {
        float[] pixels = RgbMaster.rgbIntToArray(color);
        pixels[0] = 0;
        pixels[1] = 0;
        return RgbMaster.rgbArrayToInt(pixels);
    }

    void fft(int color) {
        frequency.merge(color, 1, Integer::sum);
    }
}
