public class CharAtString {
    public static void main(String args[]) {
        String firstname = "Chinki";
        String lastname = "Mishra";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.length());
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
