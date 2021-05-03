package com.kpi.fict.it01.Zadniprianets.CourseWork.models;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class OpenInfo extends AbstractInfo {
    private String firstName;
    private PersonSex sex;
    private int age;

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
