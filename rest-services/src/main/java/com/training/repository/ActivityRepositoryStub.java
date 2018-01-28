package com.training.repository;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Activity;
import com.training.model.ActivitySearch;
import com.training.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();

		Activity activity1 = new Activity();

		activity1.setDescription("Swimming");
		activity1.setDuraton(40);

		activities.add(activity1);

		Activity activity2 = new Activity();

		activity2.setDescription("Cycling");
		activity2.setDuraton(60);

		activities.add(activity2);

		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {

		Activity activity1 = new Activity();

		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuraton(40);

		User user = new User();

		user.setId("5678");
		user.setName("Ahmed");
		activity1.setUser(user);

		return activity1;
	}

	@Override
	public void create(Activity activity) {

	}

	@Override
	public Activity update(Activity activity) {
		// search the database to see if we have an activity with that id already
		// select * from Activity where id=?
		// if rs size==0
		// insert into Activity table
		// else
		// Update the Activity
		return activity;
	}

	@Override
	public void delete(String activityId) {
		// delete from Activity where activityID=?

	}

	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		// Select *from Activity where description in (?,?,?) and duration > ? and
		// duration < ?

		List<Activity> activities = new ArrayList<>();
		Activity activity = new Activity();

		activity.setId("1478");
		activity.setDescription("swimming");
		activity.setDuraton(55);

		activities.add(activity);

		return activities;
	}

	@Override
	public List<Activity> findByConstraints(ActivitySearch search) {

		System.out.println(search.getDurationTO());
		System.out.println(search.getSearchType());

		List<Activity> activities = new ArrayList<>();
		Activity activity = new Activity();

		activity.setId("1478");
		activity.setDescription("swimming");
		activity.setDuraton(55);

		activities.add(activity);

		return activities;
	}
}
