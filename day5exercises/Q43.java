package day5exercises;

private class Base{ // compile time error occurs : 	- Illegal modifier for the class Base; only public, abstract & final are permitted 
Base(){
int i = 100;
System.out.println(i);
}
}
public class Q43 extends Base{
static int i = 200;
public static void main(String argv[]){
Q43 p = new Q43();
System.out.println(i);
}
}