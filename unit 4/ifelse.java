public class ifelse {

    public static void main(String[] args) {
        // boolean isMale=false; does not give output
        boolean isMale=true;//give output 
        String name ="bob";
        System.out.println("before if ");

        if (isMale) {
            System.out.println("Mr. "+name);
        }
        else{
            System.out.println("ms."+name);
        }
        System.out.println("After if");
    }
}