//package SYP.MIDI;
//
//import javax.sound.midi.*;
//
///**
// * Created by maxim-mac on 13/05/2017.
// */
//public class MiniMusicPlayer2 implements ControllerEventListener{
//    public static void main (String[] args){
//        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
//        mini.go();
//    }
//
//    public void go(){
//        try {
//            Sequencer sequencer = MidiSystem.getSequencer();
//            sequencer.open();
//
//            int[] eventsIWant = {127};
//            sequencer.addControllerEventListener(this, eventsIWant);
//            //регистрируем события синтезатором Метод, отвечающий за регистрацию, принимает объект слушателя и целочиленный
//            //массив, представляющий собой списк событий ControllerEvent, которые нам нужны. Нас интересует только одно событие - #127
//
//            Sequence seq = new Sequence(Sequence.PPQ, 4);
//            Track track = seq.createTrack();
//
//            for (int i = 5; i < 61; i += 4) {
//
//                track.add(makeEvent(144, 1, i, 100, i));
//                track.add(makeEvent(176, 1, 127, 0, i));
//                //Вот так мы ловим ритм - добавляем наше собственное событие ControllerEvent(176 означает, что тип события - ControllerEvent)
//                //с аргументом
//                track.add(makeEvent(128, 1, i, 100, i + 2));
//            }
//
//            sequencer.setSequence(seq);
//            sequencer.setTempoInBPM(220);
//            sequencer.start();
//        }catch (Exception ex) {ex.printStackTrace();}
//    }
//
//    public void controlChange(ShortMessage event) {
//        System.out.print("ля");
//    }
//    //метод обработки события (из интерфейса слушателя события ControllerEvent). При каждом получении события мы пишем "ля"
//
//    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
//        MidiEvent event = null;
//        try {
//            ShortMessage a = new ShortMessage();
//            a.setMessage(comd, chan, one, two);
//            event = new MidiEvent(a, tick);
//
//        }catch (Exception e) { }
//        return event;
//    }
//}
