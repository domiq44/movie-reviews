package animesh371.movie.reviews.domain;

import java.util.function.Consumer;

import org.requirementsascode.Model;

import animesh371.movie.reviews.others.MovieSearchRequest;

public class CommandMapperModel {

	private static final Class<MovieSearchRequest> searchMovies = MovieSearchRequest.class;

	private CommandMapperModel() {
	}

	public static Model build(Consumer<MovieSearchRequest> displayMovies) {
		return Model.builder()
				.user(searchMovies)
				.system(displayMovies)
				.build();
	}
}
