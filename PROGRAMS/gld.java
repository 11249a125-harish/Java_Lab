
/*
Aim:
To write a Java program to demonstrate GridLayout
using an applet with 10 buttons arranged in 5 rows
and 2 columns.

Algorithm:
1. Start the program.
2. Import AWT and Applet packages.
3. Create a class named gld extending Applet.
4. Set GridLayout with 5 rows and 2 columns.
5. Create 10 buttons labeled A to J.
6. Add all buttons to the applet.
7. Set the margins using getInsets().
8. Display the buttons in grid format.
9. Stop the program.
*/

import java.awt.*;
import java.applet.*;

public class gld extends Applet {

    public void init() {

        setLayout(new GridLayout(5, 2));

        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }

    public Insets getInsets() {
        return new Insets(20, 20, 20, 20);
    }
}

/*
Result:
Thus, the Java applet program demonstrating GridLayout
with 10 buttons arranged in 5 rows and 2 columns
was written successfully.
*/
