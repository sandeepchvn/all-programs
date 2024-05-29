package junit.testing;

public class EligibleToVote extends RuntimeException {

	private String message="Eligible To Vote";
	@Override
	public String getMessage() {
		return this.message;
	}
}
