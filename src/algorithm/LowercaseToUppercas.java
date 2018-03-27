package algorithm;

public class LowercaseToUppercas {

    public char lowercaseToUppercase(char character) {
        String s= String.valueOf(character);
     return  s.equals(s.toUpperCase())?s.toLowerCase().toCharArray()[0]:s.toUpperCase().toCharArray()[0];
    }
}
