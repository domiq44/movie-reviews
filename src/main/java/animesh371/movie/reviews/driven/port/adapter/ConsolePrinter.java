package animesh371.movie.reviews.driven.port.adapter;

import java.util.List;

import animesh371.movie.reviews.driven.ports.IPrintMovieReviews;
import animesh371.movie.reviews.others.MovieReview;

public class ConsolePrinter implements IPrintMovieReviews {

	@Override
	public void writeMovieReviews(List<MovieReview> movieReviewList) {
		movieReviewList.forEach(movieReview -> {
			System.out.println("console> " + movieReview.toString());
		});
	}
}
