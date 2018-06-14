package test9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
	@Test
	public void FixedTests() {
		assertEquals(Troll.disemvowel("This website is for losers LOL!"), "Ths wbst s fr lsrs LL!");
		assertEquals(Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"),
				"N ffns bt,\nYr wrtng s mng th wrst 'v vr rd");
		assertEquals(Troll.disemvowel("What are you, a communist?"), "Wht r y,  cmmnst?");
	}
}
