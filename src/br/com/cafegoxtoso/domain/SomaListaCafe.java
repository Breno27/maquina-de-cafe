package br.com.cafegoxtoso.domain;

import java.util.List;

public class SomaListaCafe {
    public double somaCafes(List<Cafes> cafes) {
        return cafes.stream()
                .mapToDouble(Cafes::getValor)
                .sum();
    }
}
