package br.natalia.morphology.model;

import javafx.scene.image.Image;
import org.opencv.core.Mat;

public abstract class ImageFilter {

    public Image filterToImage(Image image) {
        Mat mat = filter(OpenCVUtils.image2Mat(image));
        return OpenCVUtils.mat2Image(mat);
    }

    public abstract Mat filter(Mat mat);

}
