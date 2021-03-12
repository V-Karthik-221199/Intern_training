package day5exercises;

public class Q35{
public static void main(String argv[]){
Q35 c=new Q35();
String s=new String("ello");
c.amethod(s);
}
public void amethod(String s){
char c='H';
c+=s; // compile time error 
System.out.println(c);
}

/* The only operator overloading offered by java is the + sign for the String class. A char is a 16 bit integer and cannot be concatenated to a string with the + operator. */
}
