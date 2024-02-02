import static org.junit.Assert.*;
import org.junit.Test;

public class GoodVsEvilTest {
  @Test
	public void testEvilWin() {
    assertEquals("Evil should win", "Battle Result: Evil eradicates all trace of Good",
      GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
  }
  
  @Test
	public void testGoodWin() {
    assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
      GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
  }
  
  @Test
	public void testTie() {
    assertEquals("Should be a tie", "Battle Result: No victor on this battle field",
      GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
  }
}

public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    

        String[] gd = goodAmounts.split(" ");
        String[] ev = evilAmounts.split(" ");

        int[] gd1 = {1,2,3,3,4,10};
        int[] ev1 = {1,2,2,2,3,5,10};

        int good = 0;
        for(int i = 0; i < gd1.length; i++) {
            good += Integer.parseInt(gd[i])*gd1[i];
        }
        int evil = 0;
        for(int i = 0; i < ev1.length; i++){
            evil += Integer.parseInt(ev[i])*ev1[i];
        }
    
      if(good > evil){
        return "Battle Result: Good triumphs over Evil";
      }if(good < evil){
        return "Battle Result: Evil eradicates all trace of Good";
      }if(good == evil){
        return "Battle Result: No victor on this battle field";
      }
    
    return "";
  }
}
