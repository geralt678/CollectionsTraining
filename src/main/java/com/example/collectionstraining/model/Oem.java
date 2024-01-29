package com.example.collectionstraining.model;

public enum Oem {

    RENAULT(1),
    SKODA(2),
    OPEL(3);


    Integer oemId;

    Oem(Integer oemId) {
        this.oemId = oemId;
    }

    public Integer getOemId() {
        return oemId;
    }
}
