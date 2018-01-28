package com.training.repository;

import java.util.List;

import com.training.model.Activity;
import com.training.model.ActivitySearch;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);

	void create(Activity activity);

	Activity update(Activity activity);

	void delete(String activityId);

	List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo);

	List<Activity> findByConstraints(ActivitySearch search);

}