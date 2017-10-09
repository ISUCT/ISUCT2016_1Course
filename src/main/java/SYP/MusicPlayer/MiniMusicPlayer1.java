package SYP.MusicPlayer;

import javax.sound.midi.*;

/**
 * Created by maxim-mac on 13/05/2017.
 */
public class MiniMusicPlayer1 {
    public static void main(String[] args){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            //создаём и открываем синтезатор

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            //создаём последовтаельность и дорожку
            for (int i = 5; i < 61; i += 4) {
                //создаём группу событий, чтобы ноты продолжали подниматься (от ноты фортепиано 5 до ноты 61)

                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
                //вызываем новый метод makeEvent(), чтобы создать сообщение и событие, а затем добавляем результат (MidiEvent,
                //полученное из makeEvent()) в дорожку. Они представляют собой пару включени (144) и отключения воспроизведения ноты (128)
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
            //запускаем его
        }catch (Exception ex) {ex.printStackTrace();}
    }

        public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
            MidiEvent event = null;
            try {
                ShortMessage a = new ShortMessage();
                a.setMessage(comd, chan, one, two);
                event = new MidiEvent(a, tick);

            }catch (Exception e) { }
            return event;
        }
}

