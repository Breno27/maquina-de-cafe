package br.com.cafegoxtoso.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Cafe> cafes = new ArrayList<>();

    public List<Cafe> getCafes() {
        return cafes;
    }

    public void adicionaCafe(Cafe cafe) {
        cafes.add(cafe);
    }


}
