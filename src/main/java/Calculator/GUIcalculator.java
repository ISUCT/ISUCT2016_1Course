package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import java.util.*;


/**
 * Created by maxim-mac on 15/05/2017.
 */

/*


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
    private String xVal = "1.84,2.71,3.81,4.56,5.62";

    private NumberFormat ValFormat;

    private String colorXnXkDx = "#BB8D00";
    private String colorX = "#BB4E00";

    private ArrayList dataList;

    public GUIcalculator() {

        $$$setupUI$$$();
        setContentPane(contentPane);
        setVisible(true);
        getRootPane().setDefaultButton(resultButton);

        dataList = new ArrayList();


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

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onSave();
            }
        });


        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onLoad();
            }
        });
    }

    private void onSave() {
        FileMaskGUI data = new FileMaskGUI(xnVal, xkVal, dxVal, xVal, resultLabel.getText().replaceAll("\\<[^>]*>", ""), textArea1.getText());
        dataList.add(data);

//        String userhome = System.getProperty("user.home");
        JFileChooser fileSave = new JFileChooser();//(userhome + "\\Desktop");
        fileSave.showSaveDialog(contentPane);
        saveFile(fileSave.getSelectedFile());

    }

    private void onLoad() {
        JFileChooser fileOpen = new JFileChooser();
        fileOpen.showOpenDialog(contentPane);
        loadFile(fileOpen.getSelectedFile());

    }

    private void loadFile(File file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            int counter = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                counter++;
                switch (counter) {
                    case 1:
                        xnVal = Double.parseDouble(line);
                        formattedTextField1.setValue(xnVal);
                        break;
                    case 2:
                        xkVal = Double.parseDouble(line);
                        formattedTextField2.setValue(xkVal);
                        break;
                    case 3:
                        dxVal = Double.parseDouble(line);
                        formattedTextField3.setValue(dxVal);
                        break;
                    case 4:
                        formattedTextField4.setValue(line);
                        break;
                    case 5:
                        resultLabel.setText(line);
                        break;
                    case 6:
                        textArea1.setText(line);
                        break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Couldn't read file");
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
            }
        }
    }

    private void saveFile(File file) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file + ".txt"));
            Iterator dataIterator = dataList.iterator();
            while (dataIterator.hasNext()) {
                FileMaskGUI dataList = (FileMaskGUI) dataIterator.next();
                writer.write(dataList.getXnStr() + "\n");
                writer.write(dataList.getXkStr() + "\n");
                writer.write(dataList.getDxStr() + "\n");
                writer.write(dataList.getxStr() + "\n");
                writer.write(dataList.getxLabelStr() + "\n");
                writer.write(dataList.getxResStr() + "\n");
            }
        } catch (IOException ex) {
            resultLabel.setText("<html>Result: <font color=\"red\">Couldn't write file</font></html>");
            ex.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
            }
        }
    }

    private void onResult() {
        // add your code here
        xnVal = ((Number) formattedTextField1.getValue()).doubleValue();
        xkVal = ((Number) formattedTextField2.getValue()).doubleValue();
        dxVal = ((Number) formattedTextField3.getValue()).doubleValue();
        String xVal = (String) formattedTextField4.getValue();

        if (xVal.isEmpty()) {
            if (dxVal >= 0.01 && xkVal <= 1000 && xnVal >= -1000) {
                try {
                    ArrayList<Double> answer = new Calculator().equ1(xnVal, xkVal, dxVal);
                    resultLabel.setText("<html>Result for <font color=\"" + colorXnXkDx + "\">" + xnLabel.getText() + "</font>" + xnVal + ", "
                            + "<font color=\"" + colorXnXkDx + "\">" + xkLabel.getText() + "</font>" + xkVal + ", "
                            + "<font color=\"" + colorXnXkDx + "\">" + dxLabel.getText() + "</font>" + dxVal + "</html>");
                    textArea1.setText(String.valueOf(new ArrayList<Double>(answer)).replace("[", "").replace("]", ""));
                } catch (Exception e) {
                    e.printStackTrace();
                    Error();
                }
            } else {
                Error();
            }

        } else {
            try {
                String[] xStrArray = xVal.split(",");
                Double[] doubleArrayX = new Double[xStrArray.length];
                for (int i = 0; i < xStrArray.length; i++) {
                    doubleArrayX[i] = Double.parseDouble(xStrArray[i]);
                }
                ArrayList<Double> xValRes = new ArrayList<Double>(Arrays.<Double>asList(doubleArrayX));
                ArrayList<Double> answer = new Calculator().equ1(xValRes);

                resultLabel.setText("<html>Result for <font color=\"" + colorX + "\">" + xLabel.getText() + "</font>" + xVal + "</html>");
                textArea1.setText(answer.toString().replace("[", "").replace("]", ""));

            } catch (Exception e) {
                e.printStackTrace();
                resultLabel.setText("<html>Result: <font color=\"red\">Error</font></html>");
                textArea1.setText("Check Array");
            }
        }
    }

    private void Error() {
        resultLabel.setText("<html>Result: <font color=\"red\">Error</font></html>");
        textArea1.setText("Enter the correct values");
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        GUIcalculator frame = new GUIcalculator();
        frame.setSize(500, 175);
//        frame.pack(); //минимальный размер
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        formattedTextField1 = new JFormattedTextField(ValFormat);
        formattedTextField1.setValue(new Double(xnVal));
        formattedTextField1.setColumns(10);

        formattedTextField2 = new JFormattedTextField(ValFormat);
        formattedTextField2.setValue(new Double(xkVal));
        formattedTextField2.setColumns(10);

        formattedTextField3 = new JFormattedTextField(ValFormat);
        formattedTextField3.setValue(new Double(dxVal));
        formattedTextField3.setColumns(10);


        formattedTextField4 = new JFormattedTextField();
        formattedTextField4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_MINUS) && (c != KeyEvent.VK_COMMA) && (c != KeyEvent.VK_PERIOD) && (c != KeyEvent.VK_SPACE)) {
                    e.consume();
                }
            }
        });
        formattedTextField4.setValue(xVal);

        xnLabel = new JLabel();
        xnLabel.setForeground(Color.decode(colorXnXkDx));
        xkLabel = new JLabel();
        xkLabel.setForeground(Color.decode(colorXnXkDx));
        dxLabel = new JLabel();
        dxLabel.setForeground(Color.decode(colorXnXkDx));
        xLabel = new JLabel();
        xLabel.setForeground(Color.decode(colorX));
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */


/*
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
        xnLabel.setText("xn:");
        panel2.add(xnLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        xkLabel.setText("xk:");
        panel2.add(xkLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dxLabel.setText("dx:");
        panel2.add(dxLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        xLabel.setText("x:");
        panel2.add(xLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1, true, false));
        panel3.add(panel4, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel3.add(panel5, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel5.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        textArea1 = new JTextArea();
        textArea1.setColumns(10);
        textArea1.setLineWrap(true);
        scrollPane1.setViewportView(textArea1);
        resultLabel = new JLabel();
        resultLabel.setText("Result:");
        panel5.add(resultLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        xnLabel.setLabelFor(formattedTextField1);
        xkLabel.setLabelFor(formattedTextField2);
        dxLabel.setLabelFor(formattedTextField3);
        xLabel.setLabelFor(formattedTextField4);
        resultLabel.setLabelFor(textArea1);
    }

    /**
     * @noinspection ALL
     */

/*
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }
}

*/




