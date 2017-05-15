package Calculator;

import org.apache.commons.lang3.ArrayUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.List;


/**
 * Created by maxim-mac on 15/05/2017.
 */
public class GUIcalculator extends JFrame {
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JFormattedTextField formattedTextField4;
    private JButton cancelButton;
    private JButton resultButton;
    private JButton loadButton;
    private JButton saveButton;
    private JTextArea textArea1;
    private JLabel resultLabel;
    private JLabel xnLabel;
    private JLabel xkLabel;
    private JLabel dxLabel;
    private JLabel xLabel;
    private JPanel contentPane;


    private double xnVal = 1.25;
    private double xkVal = 3.25;
    private double dxVal = 0.4;
    private String xVal = "1.84, 2.71, 3.81, 4.56, 5.62";


    private NumberFormat xnValFormat;
    private NumberFormat xkValFormat;
    private NumberFormat dxValFormat;

//    Double[] xVal = {1.84, 2.71, 3.81, 4.56, 5.62};
//
//        на случай поля с массивом

//    List<Double> xVal = Arrays.asList(1.84, 2.71, 3.81, 4.56, 5.62);
//
//        на случай поля с массивом, последний способ

//    private ArrayList<xValues> xVal = new ArrayList<xValues>();
//    class xValue{
//        private double xVal;
//
//        public xValue(double xVal) {
//            this.xVal = xVal;
//        }
//        public double getxVal2() {
//            return xVal;
//        }
//    }
//
//        на случай поля с массивом


//    private NumberFormat xValFormat;
//
//        на случай поля с массивом


    public GUIcalculator() {

        $$$setupUI$$$();
        setContentPane(contentPane);
        setVisible(true);
        getRootPane().setDefaultButton(resultButton);

        setUpFormats();


        //        formattedTextField1.setValue(new Double(xnVal));

//        formattedTextField1 = new JFormattedTextField(xnValFormat);

//        formattedTextField1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//
////                xnVal = ((Number)formattedTextField1.getValue()).doubleValue();
////                Double xnVal = (Double)formattedTextField1.getValue();
//
//            }
//        });


        resultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onResult();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onResult() {
        // add your code here
        xnVal = ((Number) formattedTextField1.getValue()).doubleValue();
        xkVal = ((Number) formattedTextField2.getValue()).doubleValue();
        dxVal = ((Number) formattedTextField3.getValue()).doubleValue();

        String xVal = (String) formattedTextField4.getValue();
//        List<String> xValList = new ArrayList<String>(Arrays.asList(xVal.split(",")));
//        xVal = formattedTextField4.getValue();

        if (xVadl == null) {
            ArrayList<Double> answer = new Calculator().equ1(xnVal, xkVal, dxVal);
            resultLabel.setText("Result: [xn:" + xnVal + " xk:" + xkVal + " dx:" + dxVal + "]");
            textArea1.setText(String.valueOf(new ArrayList<Double>(answer)));
        } else {
            try {

                ArrayList<Double> answer = new Calculator().equ1(splitArrX());
                resultLabel.setText("Result: [x:" + splitArrX() + "]");
                textArea1.setText(String.valueOf(new ArrayList<Double>(answer)));
            } catch (Exception e) {
                resultLabel.setText("Result: Error");
                textArea1.setText("Check Array");
            }
        }


    }

//    public List<Double> tempArrX() {
//
//        Double[] doubleArray = ArrayUtils.toObject(splitArrX(String xVal));
//        List<Double> list = Arrays.asList(doubleArray);
//        return list;
//    }


    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

//    public void propertyChange(PropertyChangeEvent e) {
////        Object source = e.getSource();
////        if (source == formattedTextField1) {
////            xnVal = ((Number) formattedTextField1.getValue()).doubleValue();
////        } else if (source == formattedTextField2) {
////            xkVal = ((Number) formattedTextField2.getValue()).doubleValue();
////        } else if (source == formattedTextField3) {
////            dxVal = ((Number) formattedTextField3.getValue()).doubleValue();
////        }
//    }


    public ArrayList<Double> splitArrX(String xVal) {
        String[] xStrArray = xVal.split(",");
        Double[] doubleArrayX = new Double[xStrArray.length];
        for (int i = 0; i < xStrArray.length; i++) {
            doubleArrayX[i] = Double.parseDouble(xStrArray[i]);
            //это как тот tmp

        }
        ArrayList<Double> xValRes = new ArrayList<Double>(Arrays.<Double>asList(doubleArrayX));
        return (xValRes);

    }

//        double payment = computePayment(amount, rate, numPeriods);
//        paymentField.setValue(new Double(payment));

    public static void main(String[] args) {
        GUIcalculator frame = new GUIcalculator();
        frame.pack();
        frame.setVisible(true);
//        frame.splitArrX("1.84,2.71,3.81,4.56,5.62");

    }

    private void setUpFormats() {
        xnValFormat = NumberFormat.getNumberInstance();
        xkValFormat = NumberFormat.getNumberInstance();
        dxValFormat = NumberFormat.getNumberInstance();
    }


    //    public ArrayList<Double> tempArrX(){
//        Double []tmp = {1.84,2.71,3.81,4.56,5.62};
//        ArrayList<Double> xValRes =  new ArrayList<Double>(Arrays.<Double>asList(tmp));
//        return(xValRes);
//    }
//
//    Double xnVal = (Double)formattedTextField1.getValue();
//
//
//    ArrayList<Double> xValRes = new Calculator().equ1(tempArrX());
//
//    ArrayList<Double> xValRes = new Calculator().equ1(1.25, 3.25, 0.4);

//    Double []xVal = {1.84,2.71,3.81,4.56,5.62};
//
//    public ArrayList<Double> xAddArray(){
//        ArrayList<Double> xValArray =  new ArrayList<Double>(Arrays.<Double>asList(xVal));
//        return(xValArray);
//    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        formattedTextField1 = new JFormattedTextField(xnValFormat);
        formattedTextField1.setValue(new Double(xnVal));
        formattedTextField1.setColumns(10);
//        formattedTextField1.addPropertyChangeListener("value", this);

        formattedTextField2 = new JFormattedTextField(xkValFormat);
        formattedTextField2.setValue(new Double(xkVal));
        formattedTextField2.setColumns(10);
//        formattedTextField2.addPropertyChangeListener("value", this);

        formattedTextField3 = new JFormattedTextField(dxValFormat);
        formattedTextField3.setValue(new Double(dxVal));
        formattedTextField3.setColumns(10);
//        formattedTextField3.addPropertyChangeListener("value", this);


        formattedTextField4 = new JFormattedTextField();
        formattedTextField4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_MINUS) && (c != KeyEvent.VK_COMMA) && (c != KeyEvent.VK_PERIOD)) {
                    e.consume();
                }
            }
        });

        formattedTextField4.setValue(xVal);

        resultLabel = new JLabel();


    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        contentPane = new JPanel();
        contentPane.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel2.add(formattedTextField1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        panel2.add(formattedTextField2, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        panel2.add(formattedTextField3, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        panel2.add(formattedTextField4, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        xnLabel = new JLabel();
        xnLabel.setText("xn:");
        panel2.add(xnLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        xkLabel = new JLabel();
        xkLabel.setText("xk:");
        panel2.add(xkLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dxLabel = new JLabel();
        dxLabel.setText("dx:");
        panel2.add(dxLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        xLabel = new JLabel();
        xLabel.setText("x:");
        panel2.add(xLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel3.add(panel4, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        cancelButton = new JButton();
        cancelButton.setText("Cancel");
        panel4.add(cancelButton, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultButton = new JButton();
        resultButton.setText("Result");
        panel4.add(resultButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        loadButton = new JButton();
        loadButton.setText("Load");
        panel4.add(loadButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        saveButton = new JButton();
        saveButton.setText("Save");
        panel4.add(saveButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textArea1 = new JTextArea();
        textArea1.setLineWrap(true);
        panel3.add(textArea1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        resultLabel.setText("Result:");
        panel3.add(resultLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }
}




