package com.kpi.fict.it01.Zadniprianets.CourseWork.dao.inMemoryData;

import com.kpi.fict.it01.Zadniprianets.CourseWork.models.*;

import java.util.Map;
import java.util.UUID;

public class InMemoryDatabase {
    private Map<String, User> users;
    private Map<UUID, Application> applications;
    private Map<UUID, KeyWord> keywords;
    private Map<UUID, Match> matches;
    private Map<UUID, AbstractInfo> infos;
}
