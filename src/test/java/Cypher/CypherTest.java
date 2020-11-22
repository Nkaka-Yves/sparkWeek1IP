package Cypher;
import Cypher.Cypher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CypherTest {
    @Test
    public void testIfInstanceCorrectly() {
        Cypher testCypher = new Cypher("Yves",3);
        assertEquals(true, testCypher instanceof Cypher);
    }
    @Test
    public void testIfgetkey() {
        Cypher testCypher = new Cypher("Yves",3);
        assertEquals(3, testCypher.getKey());
    }
    @Test
    public void testIfgetText() {
        Cypher testCypher = new Cypher("Yves",3);
        assertEquals("Yves", testCypher.getText());
    }
    @Test
    public void testIfEncryptionWork(){
        int key = 2;
        String word = "nkaka";
        String expectedIncription = "pmcmc";
        assertEquals(expectedIncription,Cypher.Cypher(word,key));
    }
    @Test
    public void testIfEncryptionOfNumbersWorks() {
        int key = 2;
        String word = "1";
        String expectedIncription = "Use letters";
        assertEquals(expectedIncription,Cypher.Cypher(word,key));
    }
}