package org.telbot.telran.info.service;

import org.telbot.telran.info.model.UserSchedule;

import java.util.List;

public interface UserScheduleService {

    List<UserSchedule> listAllUserSchedule();

    UserSchedule getUserSchedule(int id);

    UserSchedule createUserSchedule(UserSchedule userSchedule);

    UserSchedule updateUserSchedule(UserSchedule userSchedule);

    void deleteUserSchedule(int id);
}