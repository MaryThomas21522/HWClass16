public class Task2 {


//    public String returns(String s) {
//        String empty = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            empty = empty + s.charAt(i);
//
//        }
//        return empty;
//    }
//    public static void main (String[]args){
//        Task2 obj = new Task2();
//        String answer = obj.returns("Let's go eat!");
//        System.out.println(answer);
//    }


    public String reverseString (String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        return sb.toString();

    }

    public static void main(String[] args) {
        Task2 sb=new Task2();
        System.out.println(sb.reverseString("Let's go eat!"));
    }
}




/*
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name
 */
