package com.kpi.fict.it01.Zadniprianets.CourseWork.services;

import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.abstractions.DaoFactory;

public class ApplicationService {
    DaoFactory daoFactory;

    public ApplicationService(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
}
