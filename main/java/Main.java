import Controller.Function;

public class Main {
 public static void main(String[] args) {
        Function function = new Function();

        String inputString = "32hg321sdhkjDFGH!@#$%^22fdsf3fdgdf/";
        
        function.getNumber(inputString);
        function.getCharacter(inputString);
    }
}
