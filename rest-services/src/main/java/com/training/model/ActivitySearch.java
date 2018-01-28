package com.training.model;

import java.util.List;

public class ActivitySearch {

	private int durationFrom;

	private int durationTO;

	private List<String> descriptions;

	private ActivitySearchType searchType;

	public List<String> getDescriptions() {
		return descriptions;
	}

	public int getDurationFrom() {
		return durationFrom;
	}

	public int getDurationTO() {
		return durationTO;
	}

	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}

	public void setDurationFrom(int durationFrom) {
		this.durationFrom = durationFrom;
	}

	public void setDurationTO(int durationTO) {
		this.durationTO = durationTO;
	}

	public ActivitySearchType getSearchType() {
		return searchType;
	}

	public void setSearchType(ActivitySearchType searchType) {
		this.searchType = searchType;
	}

}
