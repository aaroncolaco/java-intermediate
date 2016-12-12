package com.collections.movie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Driver {

	List<Movie> movieList;

	public Driver() {
		movieList = new ArrayList<>();
	}

	public List<Movie> createMovieList() {
		int movieCount = 10;

		Movie movie = null;

		for (int i = 0; i < movieCount; i++) {
			movie = new Movie();
			movie.setName("Movie " + (i + 1));
			movie.setDate(new Date());
			movie.setDirector(Math.random() < 0.5 ? "Director A" : "Director B");
			movie.setDuration(2.5f);
			movie.setLanguage("English");
			movie.setProducer("Producer " + (i + 1));

			movieList.add(movie);
		}

		return movieList;
	}

	public void sortByLanguage(List<Movie> movieList) {
		Collections.sort(movieList);
	}

	
	
	// using comparator in movie class
	public void sortByDirector(List<Movie> movieList) {
		Collections.sort(movieList, new Movie());
	}

	
	
	// using anonymous inner type
	public void sortByDate(List<Movie> movieList) {
		Comparator<Movie> dateComparator = new Comparator<Movie>() {
			@Override
			public int compare(Movie movie1, Movie movie2) {
				return movie1.getDate().compareTo(movie2.getDate());
			}
			
		};
		Collections.sort(movieList, new Movie());
	}

	
	// using external comparator class
	public void sortBylanguageAndReleaseDate(List<Movie> movieList) {
		Collections.sort(movieList, new LangDateSorter());
	}

	
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		List<Movie> movieList = driver.createMovieList();
		
		System.out.println("Original: " + movieList);
		
		driver.sortByDate(movieList);
		System.out.println("By date: " + movieList);
		
		driver.sortByDirector(movieList);
		System.out.println("By director: " + movieList);
		
		driver.sortByLanguage(movieList);
		System.out.println("By lang: " + movieList);
		
		driver.sortBylanguageAndReleaseDate(movieList);
		System.out.println("By lang and date: " + movieList);
	}
}
