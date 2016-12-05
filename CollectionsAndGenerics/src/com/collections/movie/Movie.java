package com.collections.movie;

import java.util.Comparator;
import java.util.Date;

public class Movie implements Comparable<Movie>, Comparator<Movie> {
	private String name, language, director, producer;
	private float duration;
	Date date;

	public Movie() {
	}

	public Movie(String name, String language, String director,
			String producer, float duration, Date date) {
		this.name = name;
		this.language = language;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	// comparable
	@Override
	public int compareTo(Movie movie) {
		return this.language.compareTo(movie.getLanguage());
	}
	
	// comparator
	@Override
	public int compare(Movie movie1, Movie movie2) {
		return movie1.getDirector().compareTo(movie2.getDirector());
	}
	
	// to print each movie in the movie list
	@Override
	public String toString() {
		String returnString = this.getName() + " - directed by " + this.getDirector();
		return returnString;
	}

}
