package br.nataliakt.morphology.model;

import br.nataliakt.id.model.ImageFilter;
import org.opencv.core.Mat;

public class ClosureFilter extends ImageFilter {

    @Override
    public Mat filter(Mat mat) {
        ErosionFilter erosionFilter = new ErosionFilter();
        mat = erosionFilter.filter(mat);
        DilationFilter dilationFilter = new DilationFilter();
        mat = dilationFilter.filter(mat);
        return mat;
    }

    @Override
    public String toString() {
        return "Fechamento";
    }
}
