import java.util.Locale;

public class String1 {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";

        String sUpper = original.toUpperCase();
        String sLower = original.toLowerCase();
        String sTrim = original.trim();
        String sSubstring = original.substring(2);
        String sSubstringLimited = original.substring(2, 9);
        String sReplace = original.replace('a', 'x');
        String sReplaceSubstring = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println("Original " + original);
        System.out.println("To lower case " + sLower);
        System.out.println("To upper case" + sUpper);
        System.out.println("Trim " + sTrim);
        System.out.println("Substring " + sSubstring);
        System.out.println("Substring " + sSubstringLimited);
        System.out.println("Replacing " + sReplace);
        System.out.println("Replacing " + sReplaceSubstring);
        System.out.println("indexof " + i);
        System.out.println("lastIndex of bc " + j);

        String split ="potato lemon apple";
        String [] vect = split.split(" ");
        System.out.println((vect[0]));
        System.out.println((vect[1]));
        System.out.println((vect[2]));

    }
}
