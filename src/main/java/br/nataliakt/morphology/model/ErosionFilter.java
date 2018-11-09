package br.nataliakt.morphology.model;

import br.nataliakt.id.model.ImageFilter;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

public class ErosionFilter extends ImageFilter {

    @Override
    public Mat filter(Mat mat) {
        Mat destination = new Mat(mat.rows(), mat.cols(), mat.type());
        Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3, 3));
        Imgproc.erode(mat, destination, element);
        return destination;
    }

    public String toString() {
        return "Erosão";
    }
}
