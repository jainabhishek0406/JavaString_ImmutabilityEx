/**
 * @author Abhishek Jain
 *
 * String is Immutable or Mutable???
 */
public class ImmutableStringEx {
    public static void main(String[] args) {
        String str1 = "Abhishek";
        String str2 = "Jain";

        System.out.println("str1 & str2 values and hashcode before string concatenation");
        System.out.println("str1 hashcode = " + str1.hashCode());
        System.out.println("str1 content = " + str1);
        System.out.println("str2 hashcode = " + str2.hashCode());
        System.out.println("str2 content = " + str2);

        //string concatenation
        str1 = str1+str2;

        System.out.println("\nstr1 & str2 values and hashcode after string concatenation");
        System.out.println("str1 hashcode = " + str1.hashCode());
        System.out.println("str1 content = " + str1);
        System.out.println("str2 hashcode = " + str2.hashCode());
        System.out.println("str2 content = " + str2);

        //str1 hashcode is changed after concatenation, it means reference is updated because object is created again after concatenation.
        //str2 hashcode is same.
    }
}
