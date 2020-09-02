package animesh371.movie.reviews.others;

public class MovieSearchRequest {

	private final String movieName;

	public MovieSearchRequest(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}
}
