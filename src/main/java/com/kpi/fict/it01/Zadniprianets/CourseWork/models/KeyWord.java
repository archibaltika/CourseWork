package com.kpi.fict.it01.Zadniprianets.CourseWork.models;

import java.util.UUID;

public class KeyWord {
    private UUID id;
    private String keyWord;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
