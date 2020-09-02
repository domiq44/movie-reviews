package animesh371.movie.reviews.driver.adapter;

import org.requirementsascode.Model;
import org.requirementsascode.ModelRunner;

import animesh371.movie.reviews.domain.CommandMapperModel;
import animesh371.movie.reviews.domain.MovieApp;
import animesh371.movie.reviews.driven.ports.IFetchMovieReviews;
import animesh371.movie.reviews.driven.ports.IPrintMovieReviews;
import animesh371.movie.reviews.driver.port.IUserInput;

public class UserCommandBoundary implements IUserInput {

	private final Model model;

	public UserCommandBoundary(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
		final MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
		model = CommandMapperModel.build(movieApp);
	}

	@Override
	public void handleUserInput(Object userCommand) {
		new ModelRunner()
				.run(model)
				.reactTo(userCommand);
	}
}
