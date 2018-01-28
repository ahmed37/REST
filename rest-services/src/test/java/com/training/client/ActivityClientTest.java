package com.training.client;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.training.model.Activity;
import com.training.model.ActivitySearch;
import com.training.model.ActivitySearchType;

public class ActivityClientTest {

	@Test
	public void searchObject() {
		ActivitySearchClient client = new ActivitySearchClient();

		List<String> searchValues = new ArrayList<>();
		searchValues.add("biking");
		searchValues.add("running");

		ActivitySearch search = new ActivitySearch();
		search.setDescriptions(searchValues);
		search.setDurationFrom(30);
		search.setDurationTO(55);
		search.setSearchType(ActivitySearchType.SEARCH_BY_DESCRIPTION);

		List<Activity> activities = client.search(search);

		System.out.println(activities);

		assertNotNull(activities);
	}

	@Test
	public void testSearch() {

		ActivitySearchClient client = new ActivitySearchClient();

		String param = "description";

		List<String> searchValues = new ArrayList<>();

		searchValues.add("swimming");
		searchValues.add("running");

		String secondParam = "durationFrom";
		int durationFrom = 30;

		String thirdParam = "durationTo";
		int durationTo = 90;

		List<Activity> activities = client.search(param, searchValues, secondParam, durationFrom, thirdParam,
				durationTo);

		System.out.println(activities);

		assertNotNull(activities);

	}

	@Test
	public void testDelete() {

		ActivityClient client = new ActivityClient();

		client.delete("4568");
	}

	@Test
	public void testPUT() {
		Activity activity = new Activity();

		activity.setId("3456");
		activity.setDescription("Bikram Yuga");
		activity.setDuraton(90);

		ActivityClient client = new ActivityClient();

		activity = client.update(activity);

		assertNotNull(activity);
	}

	@Test
	public void testGet() {
		ActivityClient client = new ActivityClient();

		Activity activity = client.get("1234");

		System.out.println(activity);

		assertNotNull(activity);
	}

	@Test
	public void testGetList() {
		ActivityClient client = new ActivityClient();

		List<Activity> activities = client.get();

		System.out.println(activities);

		assertNotNull(activities);

	}

	@Test(expected = RuntimeException.class)
	public void testGetWithBadRrquest() {

		ActivityClient client = new ActivityClient();

		client.get("123");

	}

	@Test
	public void testCreate() {
		ActivityClient client = new ActivityClient();

		Activity activity = new Activity();
		activity.setDescription("swimming");
		activity.setDuraton(90);

		activity = client.create(activity);

		assertNotNull(activity);

	}

}
