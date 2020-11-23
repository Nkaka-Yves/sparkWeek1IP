package Cypher;

import Cypher.Cypher;
import org.junit.Test;
import Cypher.Dicypher;

import static org.junit.Assert.assertEquals;

public class DicypherTest {

    @Test
    public void testIfDecryptionWork(){
       Dicypher.Dicypher("pmcmc",2);
        String expectedDescription = "nkaka";
        assertEquals(expectedDescription,Dicypher.Dicypher("pmcmc",2));
    }

}