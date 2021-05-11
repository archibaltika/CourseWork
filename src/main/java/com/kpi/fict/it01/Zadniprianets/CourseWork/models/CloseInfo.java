package com.kpi.fict.it01.Zadniprianets.CourseWork.models;

public class CloseInfo extends AbstractInfo {
    private String telegramTag;
    private String email;
    private String phoneNumber;

    public String getTelegramTag() {
        return telegramTag;
    }

    public void setTelegramTag(String telegrammTag) {
        this.telegramTag = telegrammTag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
