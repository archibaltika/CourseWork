package com.kpi.fict.it01.Zadniprianets.CourseWork.dao.inMemoryData;

import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.abstractions.DaoFactory;

public class InMemoryDaoFactory implements DaoFactory {
    private InMemoryDatabase database;

    public InMemoryDaoFactory(InMemoryDatabase database) {
        this.database = database;
    }
}
