package junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VotingTest {
	
	@BeforeEach
	public void tearup() {
		System.out.println("create DB connection");
	}
	@AfterEach
	public void teardown() {
		System.out.println("close all the  DB connection");
	}

	@Test
	void test() {
		Voting voting=new Voting();
		Assertions.assertThrows(NotEligibleToVote.class, ()->voting.vote(17));
	}
	@Test
	void test2() {
		Voting voting=new Voting();
		Assertions.assertThrows(NotEligibleToVote.class, ()->voting.vote(17));
	}
	@Test
	void test3() {
		Voting voting=new Voting();
		Assertions.assertThrows(NotEligibleToVote.class, ()->voting.vote(17));
	}
}
