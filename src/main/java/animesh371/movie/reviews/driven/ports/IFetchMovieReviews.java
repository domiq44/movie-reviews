package animesh371.movie.reviews.driven.ports;

import java.util.List;

import animesh371.movie.reviews.others.MovieReview;
import animesh371.movie.reviews.others.MovieSearchRequest;

public interface IFetchMovieReviews {
	public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
