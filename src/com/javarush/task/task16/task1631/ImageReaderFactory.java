package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        try {
            if (imageTypes != null) {
                if (imageTypes == ImageTypes.JPG)
                    return new JpgReader();
                if (imageTypes == ImageTypes.PNG)
                    return new PngReader();
                if (imageTypes == ImageTypes.BMP)
                    return new BmpReader();
            }
        } catch (IllegalArgumentException e) {
        }
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}