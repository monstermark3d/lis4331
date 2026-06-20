//
// written by Mark Trombly
// LIS 4331
// Summer 2026
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// onscreen components stored as fields
 
 public class DistanceCalculatorFrame implements ActionListener{

   private JFrame frame;
   private JTextField legAField;
   private JTextField legBField;
   private JLabel legCLabel;
   private JButton computeButton;

   public DistanceCalculatorFrame() {
      // set up components
      legAField = new JTextField(5);
      legBField = new JTextField(5);
      legCLabel = new JLabel("Compute Distance Of Leg C.");
      computeButton = new JButton("Compute");

      // attach GUI as event listener to Compute button

      computeButton.addActionListener(this);

      // layout
      JPanel north = new JPanel(new GridLayout(2, 2));
      north.add(new JLabel("Leg A: "));
      north.add(legAField);
      north.add(new JLabel("Leg B: "));
      north.add(legBField);

      // overall frame
      frame = new JFrame("Distance Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      frame.add(north, BorderLayout.NORTH);
      frame.add(legCLabel, BorderLayout.CENTER);
      frame.add(computeButton, BorderLayout.SOUTH);
      frame.pack();
      frame.setVisible(true);
   }

   // Handles clicks on Compute button by computing the BMI.
   public void actionPerformed(ActionEvent event) {
   // read height/weight info from text fields
      String legAText = legAField.getText();
      double legA = Double.parseDouble(legAText);
      String legBText = legBField.getText();
      double legB = Double.parseDouble(legBText);

      // compute BMI and display it onscreen
      double legC = Math.sqrt((legA * legA) + (legB * legB));
      legCLabel.setText("Leg C: " + legC);
   }
}