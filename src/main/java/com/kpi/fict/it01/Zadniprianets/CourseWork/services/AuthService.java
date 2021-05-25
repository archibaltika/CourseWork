package com.kpi.fict.it01.Zadniprianets.CourseWork.services;

import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.abstractions.DaoFactory;

public class AuthService {
    DaoFactory daoFactory;

    public AuthService(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
}
