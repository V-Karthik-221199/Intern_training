package day5exercises;

public class Q42{
public static void main(String argv[]){
Q42 l = new Q42();
l.amethod();
}
public void amethod(){
int ia[] = new int[4];
//Start For loop
for(int i=0; i< ia.length;i++)
{
ia[i]=i;
System.out.println(ia[i]);
}
}
}