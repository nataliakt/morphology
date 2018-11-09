package br.nataliakt.morphology.model;

import br.nataliakt.id.model.ImageFilter;
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
