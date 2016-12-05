package com.collections.movie;

import java.util.Comparator;

public class LangDateSorter implements Comparator<Movie> {

	@Override
	public int compare(Movie movie1, Movie movie2) {
		int langComparison = movie1.getLanguage().compareToIgnoreCase(movie2.getLanguage());
		
		if (langComparison != 0) {
			return langComparison;
		}
		return movie1.getDate().compareTo(movie2.getDate());
	}

}
