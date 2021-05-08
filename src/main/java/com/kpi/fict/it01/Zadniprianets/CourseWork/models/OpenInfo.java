package com.kpi.fict.it01.Zadniprianets.CourseWork.models;

public class OpenInfo extends AbstractInfo {
    private String firstName;
    private PersonSex sex;
    private int age;
    private String aboutMe;

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public PersonSex getSex() {
        return sex;
    }

    public void setSex(PersonSex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
