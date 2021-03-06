package com.cg.question2;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

public class MovieDetailsList {
	
		TreeSet<MovieDetails> treeSet;
		
		//...Constructor initialize treeSet
		public MovieDetailsList() {
			treeSet = new TreeSet<>((arg0,arg1) -> arg0.getMov_Name().compareTo(arg1.getMov_Name()));
		}
		
		//....Add function
		public void add(String mov_Name, String lead_actor, String lead_actress, String genre) {
			treeSet.add(new MovieDetails(mov_Name, lead_actor, lead_actress, genre));
		}
		
		//....Display function
		public void disp() {
			treeSet.stream().forEach(System.out::println);
		}

		//....Find movie by name passed in parameter
		public void findByMovieName(String movieName) {
			Predicate<MovieDetails> fetchMovie = (MovieDetails) -> MovieDetails.getMov_Name().equals(movieName);
			treeSet.stream().filter(fetchMovie).forEach(System.out::println);
		}
		
		//....Find movie by genre
		public void findMovieByGenre(String genre) {
			Predicate<MovieDetails> fetchMovie = (MovieDetails) -> MovieDetails.getGenre().equals(genre);
			treeSet.stream().filter(fetchMovie).forEach(System.out::println);
		}
		
		//....Remove movie by name
		public void removeMovie(String movieName) {
			Predicate<MovieDetails> fetchMovie = (MovieDetails) -> MovieDetails.getMov_Name().equals(movieName);
			treeSet.removeIf(fetchMovie);
			treeSet.stream().forEach(System.out::println);
		}
		
		//....Remove all movies
		public void removeAllMovie() {
			treeSet.removeAll(treeSet);
		}
		
		//....Sort by category
		public void sort() {
			System.out.println(".........Sorting by Genre........");
			treeSet.stream().sorted(Comparator.comparing(MovieDetails::getGenre)).forEach(System.out::println);
			System.out.println(".........Sorting by Lead Actor........");
			treeSet.stream().sorted(Comparator.comparing(MovieDetails::getLead_actor)).forEach(System.out::println);
			System.out.println(".........Sorting by Lead Actress........");
			treeSet.stream().sorted(Comparator.comparing(MovieDetails::getLead_actress)).forEach(System.out::println);
			System.out.println(".........Sorting by Movie Name........");
			treeSet.stream().sorted(Comparator.comparing(MovieDetails::getMov_Name)).forEach(System.out::println);
		}
	
}


