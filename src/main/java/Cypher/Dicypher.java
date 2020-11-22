package Cypher;

import static Cypher.Cypher.alphabet;

public class Dicypher {
    public static String Dicypher(String encryText, int key ){
        encryText = encryText.toLowerCase();
        String DecriptText= "";
        for (int i=0;i<encryText.length();i++){
            int position = alphabet.indexOf(encryText.charAt(i));
            int newkey = (position- key)% 26;
            if(newkey< 0){
                newkey= alphabet.length() + newkey;
            }
            char change = alphabet.charAt(newkey);
            DecriptText+= change;
        }
        return DecriptText;
    }
}
