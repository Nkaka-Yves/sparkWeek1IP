package Cypher;
public class Cypher {
    private String text;
    private int key;
    public Cypher(String text, int key) {
        this.text = text;
        this.key = key;
    }
    public String getText(){
        return this.text;
    }
    public int getKey(){
        return this.key;
    }
    public void setText(String text){
        this.text= text;
    }
    public void setKey(int key){
        this.key=key;
    }
    public  static final  String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String Cypher(String text, int key){
        text=text.toLowerCase();
        String encryText = "";
        for (int i=0;i<text.length();i++){
            int position = alphabet.indexOf(text.charAt(i));
            int newKey = ( key+position ) % 26;
            char change = alphabet.charAt(newKey);
            encryText+= change;
        }
        return encryText;
    }
}
