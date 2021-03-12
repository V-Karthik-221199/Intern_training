package day5exercises;

public class Q51{
private int i;
public static void main(String argv[]){
Q51 s = new Q51();
s.amethod(); // compile time error
}//End of main
public static void amethod(){
System.out.println(i);
}//end of amethod
}//End of class

/* Because only one instance of a static method exists not matter how many instance of the class exists it cannot access any non static variables.
 * The JVM cannot know which instance of the variable to access. */
 */