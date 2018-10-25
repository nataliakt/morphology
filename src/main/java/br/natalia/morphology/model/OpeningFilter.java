package br.natalia.morphology.model;

import org.opencv.core.Mat;

public class OpeningFilter extends ImageFilter {

    @Override
    public Mat filter(Mat mat) {
        DilationFilter dilationFilter = new DilationFilter();
        mat = dilationFilter.filter(mat);
        ErosionFilter erosionFilter = new ErosionFilter();
        mat = erosionFilter.filter(mat);
        return mat;
    }

    @Override
    public String toString() {
        return "Abertura";
    }
}
