package junit.testing;

public class NotEligibleToVote extends RuntimeException {

	private String message="Not Eligible to Vote";
	@Override
	public String getMessage() {
		return this.message;
	}
}
