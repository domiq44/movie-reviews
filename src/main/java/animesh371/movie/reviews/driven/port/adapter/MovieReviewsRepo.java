package animesh371.movie.reviews.driven.port.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import animesh371.movie.reviews.driven.ports.IFetchMovieReviews;
import animesh371.movie.reviews.others.MovieReview;
import animesh371.movie.reviews.others.MovieSearchRequest;

public class MovieReviewsRepo implements IFetchMovieReviews {

	private Map<String, List<MovieReview>> movieReviewMap;

	public MovieReviewsRepo() {
		initialize();
	}

	@Override
	public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {
		return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
				.orElse(new ArrayList<>());
	}

	private void initialize() {
		movieReviewMap = new HashMap<>();
		movieReviewMap.put("StarWars", Collections.singletonList(
				new MovieReview("1", 7.5, "Good")));
		movieReviewMap.put("StarTreck", Arrays.asList(
				new MovieReview("1", 9.5, "Excellent"),
				new MovieReview("1", 8.5, "Good")));
	}
}
