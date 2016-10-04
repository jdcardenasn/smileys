package smileys;

/**
 * @author Juan
 */
public class Smileys {
    private static void printWithSmileys(String characterString){
        
        printSmileys(characterString.length());
        if (characterString.length()%2==1){
        System.out.println(":)"+characterString+" :)");
        }
        else{
            System.out.println(":)"+characterString+":)");
        }
        printSmileys(characterString.length());
        
    }

    public static void printSmileys(int times) {
        if (times%2==1){
            times=times+1;
        }
        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
             
    public static void main(String[] args) {
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
    }
}
