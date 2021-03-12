

/* The below code snippet will not compile because any package declaration must come before any other code. */
import java.awt.*; 
package day5exercises;
class Myclass {}


/* The below two code snippet will compile without error  */

package day5exercises;
import java.awt.*;
class Myclass {}

/* This is a comment */
package day5exercises;
import java.awt.*;
class Myclass {}
S