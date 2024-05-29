package junit.testing;

public class Voting {

 public void vote(int age){
		if(age < 18 ) {
			throw new NotEligibleToVote();
		}
		else {
			throw new EligibleToVote();
		}
	}
}
