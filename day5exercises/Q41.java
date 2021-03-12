package day5exercises;

public class Q41{
static int j=20;
public static void main(String argv[]){
int i=10;
Q41 p = new Q41();
p.amethod(i);
System.out.println(i); /* when a parameter is passed to a method the method receives a copy of the value.
						The method can modify its value without affecting the original copy.
						Thus in this example when the value is printed out the method has not changed the value. */
System.out.println(j);
}
public void amethod(int x){
x=x*2;
j=j*2;
} 
// O/P: 10 and 40
}