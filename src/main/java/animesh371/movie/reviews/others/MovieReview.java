package animesh371.movie.reviews.others;

public class MovieReview {

	private final String code;
	private final double note;
	private final String quality;

	public MovieReview(String code, double note, String quality) {
		this.code = code;
		this.note = note;
		this.quality = quality;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("MovieReview [code=");
		builder.append(code);
		builder.append(", note=");
		builder.append(note);
		builder.append(", quality=");
		builder.append(quality);
		builder.append("]");
		return builder.toString();
	}
}
