package com.kpi.fict.it01.Zadniprianets.CourseWork.models;

import java.util.UUID;

public class Match {
    private UUID id;
    private UUID senderId;
    private UUID receiverId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getSenderId() {
        return senderId;
    }

    public void setSenderId(UUID senderId) {
        this.senderId = senderId;
    }

    public UUID getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(UUID receiverId) {
        this.receiverId = receiverId;
    }
}
