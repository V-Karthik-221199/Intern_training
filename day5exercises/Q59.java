package day5exercises;


class Base{
private void amethod(int iBase){
System.out.println("Base.amethod");
}
}
class Q59 extends Base{
public static void main(String argv[]){
Q59 o = new Q59();
int iBase=0;
o.amethod(iBase);
}
public void amethod(int iQ59){
System.out.println("Q59.amethod");
}
}
// O/P: Output of "Over.amethod"


/* The names of parameters to an overridden method is not important, but as the version of amethod in 
 * class Base is set to be private it is not visible within Over (despite Over extending Base) and thus does not take part in overriding. */
 */