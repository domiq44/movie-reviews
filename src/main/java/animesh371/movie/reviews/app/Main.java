package animesh371.movie.reviews.app;

import animesh371.movie.reviews.driven.port.adapter.ConsolePrinter;
import animesh371.movie.reviews.driven.port.adapter.MovieReviewsRepo;
import animesh371.movie.reviews.driven.ports.IFetchMovieReviews;
import animesh371.movie.reviews.driven.ports.IPrintMovieReviews;
import animesh371.movie.reviews.driver.adapter.UserCommandBoundary;
import animesh371.movie.reviews.driver.port.IUserInput;
import animesh371.movie.reviews.others.MovieSearchRequest;
import animesh371.movie.reviews.primary.actor.MovieUser;

public class Main {

	public static void main(String[] args) {
		final IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
		final IPrintMovieReviews printMovieReviews = new ConsolePrinter();
		final IUserInput userCommandBoundary = new UserCommandBoundary(fetchMovieReviews, printMovieReviews);
		final MovieUser movieUser = new MovieUser(userCommandBoundary);
		final MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
		final MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

		System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
		movieUser.processInput(starTreckRequest);
		System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
		movieUser.processInput(starWarsRequest);
	}
}
