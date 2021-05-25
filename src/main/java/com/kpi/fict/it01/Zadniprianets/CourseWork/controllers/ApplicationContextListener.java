package com.kpi.fict.it01.Zadniprianets.CourseWork.controllers;

import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.abstractions.DaoFactory;
import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.inMemoryData.InMemoryDaoFactory;
import com.kpi.fict.it01.Zadniprianets.CourseWork.dao.inMemoryData.InMemoryDatabase;
import com.kpi.fict.it01.Zadniprianets.CourseWork.services.ApplicationService;
import com.kpi.fict.it01.Zadniprianets.CourseWork.services.AuthService;
import com.kpi.fict.it01.Zadniprianets.CourseWork.services.MatchService;

import javax.servlet.*;
import javax.servlet.annotation.*;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DaoFactory daoFactory = new InMemoryDaoFactory(new InMemoryDatabase());

        sce.getServletContext().setAttribute("ApplicationService", new ApplicationService(daoFactory));
        sce.getServletContext().setAttribute("AuthService", new AuthService(daoFactory));
        sce.getServletContext().setAttribute("MatchService", new MatchService(daoFactory));
    }

}