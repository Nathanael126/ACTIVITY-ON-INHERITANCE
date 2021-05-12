package com.company;

public class Genus {
    private String genusName;

    public Genus(String genusName) {
        this.genusName = genusName;
    }

    @Override
    public String toString() {
        return "Genus{" +
                "genusName='" + genusName + '\'' +
                '}';
    }

    public String getGenusName() {
        return genusName;
    }
}
