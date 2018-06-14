package test4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FighterTest {
	@Test
	public void basicTests() {
		assertEquals("Lew", Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
		assertEquals("Harry", Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
		assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
		assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
		assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
		assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
	}

}

class Kata {
	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
		// Your code goes here. Have fun!
		boolean gameover = false;
		if(firstAttacker.equals(fighter1.name)) {
			while(!gameover) {
				fighter2.health -= fighter1.damagePerAttack;
				if(fighter2.health <= 0) {
					return fighter1.name;
				}
				fighter1.health -= fighter2.damagePerAttack;
				if(fighter1.health <=0 ) {
					return fighter2.name;
				}
			}
		} else {
			while(!gameover) {
				fighter1.health -= fighter2.damagePerAttack;
				if(fighter1.health <=0 ) {
					return fighter2.name;
				}
				fighter2.health -= fighter1.damagePerAttack;
				if(fighter2.health <= 0) {
					return fighter1.name;
				}
			}
		}
	
		return null;
	}
}