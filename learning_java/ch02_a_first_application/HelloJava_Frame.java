import javax.swing.*;

public class HelloJava_Frame {
    public static void main(String[] args) {
        //System.out.println("Hello, Java. (Yasen, 2020-11-15)");
        // instead of using println, we use below JFrame, with "import javax.swing.*"

        JFrame frame = new JFrame( "Hello, Java!" );

        // add one label
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
        frame.add(label);

/*         JButton button = new JButton("Continue?", JButton.BOTTOM);
        frame.add(button); */

        frame.setSize( 300, 400 );
        frame.setVisible( true );
    }
}

/*
Be aware that when you click on the window's close box, the window goes away, but your programming is still running.
We will fix this shutdown behavior in later version of the example.
*/