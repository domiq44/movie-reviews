package animesh371.movie.reviews.driven.ports;

import java.util.List;

import animesh371.movie.reviews.others.MovieReview;

public interface IPrintMovieReviews {
	public void writeMovieReviews(List<MovieReview> movieReviewList);
}
