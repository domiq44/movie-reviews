package animesh371.movie.reviews.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

import animesh371.movie.reviews.driven.ports.IFetchMovieReviews;
import animesh371.movie.reviews.driven.ports.IPrintMovieReviews;
import animesh371.movie.reviews.others.MovieReview;
import animesh371.movie.reviews.others.MovieSearchRequest;

public class MovieApp implements Consumer<MovieSearchRequest> {

	private final IFetchMovieReviews fetchMovieReviews;
	private final IPrintMovieReviews printMovieReviews;
	private static Random rand = new Random();

	public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
		this.fetchMovieReviews = fetchMovieReviews;
		this.printMovieReviews = printMovieReviews;
	}

	private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
		final List<MovieReview> result = new ArrayList<>();
		// logic to return random reviews
		for (int index = 0; index < 5; ++index) {
			if (movieReviewList.isEmpty()) {
				break;
			}
			final int randomIndex = getRandomElement(movieReviewList.size());
			final MovieReview movieReview = movieReviewList.get(randomIndex);
			movieReviewList.remove(movieReview);
			result.add(movieReview);
		}
		return result;
	}

	private int getRandomElement(int size) {
		return rand.nextInt(size);
	}

	@Override
	public void accept(MovieSearchRequest movieSearchRequest) {
		final List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
		final List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList));
		printMovieReviews.writeMovieReviews(randomReviews);
	}
}
