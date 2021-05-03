package com.kpi.fict.it01.Zadniprianets.CourseWork.models;

import java.util.ArrayList;
import java.util.UUID;

public class Application {
    private UUID id;
    private ArrayList<KeyWord> keyWords;
    private OpenInfo openInfo;
    private CloseInfo closeInfo;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList<KeyWord> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(ArrayList<KeyWord> keyWords) {
        this.keyWords = keyWords;
    }

    public OpenInfo getOpenInfo() {
        return openInfo;
    }

    public void setOpenInfo(OpenInfo openInfo) {
        this.openInfo = openInfo;
    }

    public CloseInfo getCloseInfo() {
        return closeInfo;
    }

    public void setCloseInfo(CloseInfo closeInfo) {
        this.closeInfo = closeInfo;
    }
}
