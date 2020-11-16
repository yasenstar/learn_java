//file: HelloJava2.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Hello Java 2");
        frame.add( new HelloComponent2( "Hello World, Nice Day"));
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( 500, 500 );
        frame.setVisible( true );
    }
}