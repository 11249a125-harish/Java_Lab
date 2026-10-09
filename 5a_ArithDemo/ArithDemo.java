/*
AIM:
To perform arithmetic operations using Java packages.

ALGORITHM:
Step 1: Start the program.
Step 2: Import the add, sub, mul, and div packages.
Step 3: Create objects for Add, Sub, Mul, and Div classes.
Step 4: Perform addition, subtraction, multiplication, and division.
Step 5: Display the results.
Step 6: Stop the program.
*/

import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithDemo {
    public static void main(String[] args) {

        Add ad = new Add();
        Sub su = new Sub();
        Mul mu = new Mul();
        Div di = new Div();

        ad.addop(20, 10);
        su.subop(20, 10);
        mu.mulop(20, 10);
        di.divop(20, 10);
    }
}

/*
RESULT:
Thus, arithmetic operations are performed successfully
using Java packages.
*/
