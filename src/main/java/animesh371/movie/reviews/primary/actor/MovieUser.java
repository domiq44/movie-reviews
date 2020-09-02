package animesh371.movie.reviews.primary.actor;

import animesh371.movie.reviews.driver.port.IUserInput;
import animesh371.movie.reviews.others.MovieSearchRequest;

public class MovieUser {

	private final IUserInput userInputDriverPort;

	public MovieUser(IUserInput userInputDriverPort) {
		this.userInputDriverPort = userInputDriverPort;
	}

	public void processInput(MovieSearchRequest movieSearchRequest) {
		userInputDriverPort.handleUserInput(movieSearchRequest);
	}
}
