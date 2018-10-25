package br.natalia.morphology.model;

import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

public class DilationFilter extends ImageFilter {

    @Override
    public Mat filter(Mat mat) {
        Mat destination = new Mat(mat.rows(), mat.cols(), mat.type());
        Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3, 3));
        Imgproc.dilate(mat, destination, element);
        return destination;
    }

    @Override
    public String toString() {
        return "Dilatação";
    }
}
