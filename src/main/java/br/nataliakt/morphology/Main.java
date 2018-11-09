package br.nataliakt.morphology;

import br.nataliakt.id.ImageDashboard;
import br.nataliakt.morphology.model.ClosureFilter;
import br.nataliakt.morphology.model.DilationFilter;
import br.nataliakt.morphology.model.OpeningFilter;

public class Main {

    public static void main(String[] args) {
        ImageDashboard.showFilters(new ClosureFilter(), new DilationFilter(), new OpeningFilter());
    }
}
