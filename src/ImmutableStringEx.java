/**
 * @author Abhishek Jain
 *
 * String is Immutable or Mutable???
 */
public class ImmutableStringEx {
    public static void main(String[] args) {
        String str1 = "Abhishek";
        String str2 = "Jain";

        System.out.println("str1 & str2 values before string concatenation");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        //string concatenation
        str1 = str1+str2;

        System.out.println("\nstr1 & str2 values before string concatenation");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
}
