//package SYP.MIDI;
//
//import javax.sound.midi.ControllerEventListener;
//import javax.sound.midi.ShortMessage;
//import javax.swing.*;
//import java.awt.*;
//
///**
// * Created by maxim-mac on 13/05/2017.
// */
//public class MyDrawPanel extends JPanel implements ControllerEventListener {
//    //панель для рисования - слушатель
//    boolean msg = false;
//    //присваиваем флагу значение false и будем устанавливать true, когда получим событие.
//
//    public void controlChange(ShortMessage event) {
//        msg = true;
//        repaint();
//        //мы получили событие, поэтому присваиваем флагу значение true и вызываем repaint().
//    }
//
//    public void paintComponent(Graphics g) {
//        if (msg){
//            //мы должны использовать флаг, потому что дргуие объекты могут запустить repaint(), а мы хотим рисовать только
//            //тогда, когда произойдет событие ControllerEvent.
//
//            Graphics2D g2 = (Graphics2D) g;
//
//            int r = (int) (Math.random() * 250);
//            int gr = (int) (Math.random() * 250);
//            int b = (int) (Math.random() * 250);
//
//            g.setColor(new Color(r, gr,b));
//
//            int ht = (int) ((Math.random() * 120) + 10);
//            int width = (int) ((Math.random() * 120) + 10);
//            int x = (int) ((Math.random() * 40) + 10);
//            int y = (int) ((Math.random() * 40) + 10);
//            g.fillRect(x,y,ht, width);
//            msg = false;
//        }
//    }
//}
