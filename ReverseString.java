public class ReverseString{
    public static void main(String[] args){

        String str = "ABCD";
        String rev = "" ;
          
        int len =str.lenght();
        for(int i =len-1;i>=0;i--){
            rev = rev+ str.charAt(i);
            System.out.println("Reverse of String is "+ rev);
        }
    }
}