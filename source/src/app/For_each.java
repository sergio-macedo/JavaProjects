package app;

public class For_each {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        for( int i = 0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("-------------------");
        for(String name : vect ){
            System.out.println(name);
        }
    }
}
