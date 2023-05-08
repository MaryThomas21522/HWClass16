public class Task1 {


    private String method2 (String word){

        String word1 = word.replaceAll("[^a,o,u,e,i]","");
        return word1;
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        System.out.println(obj.reverseString("conundrum"));
    }
}


/*
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
 */
