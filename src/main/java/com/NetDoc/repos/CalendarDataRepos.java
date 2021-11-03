package com.NetDoc.repos

import org.springframework.data.repository.CrudRepository;
import com.NetDoc.DataBase.CalendarData;

public interface CalendarDataRepos extends CrudRepository<CalendarData, Long> {

}