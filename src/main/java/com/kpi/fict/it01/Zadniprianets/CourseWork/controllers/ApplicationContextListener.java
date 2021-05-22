package com.kpi.fict.it01.Zadniprianets.CourseWork.controllers;

import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.abstractions.DaoFactory;
import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.inMemoryData.InMemoryDatabase;

import javax.servlet.*;
import javax.servlet.annotation.*;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        InMemoryDatabase database = new InMemoryDatabase();


    }

}