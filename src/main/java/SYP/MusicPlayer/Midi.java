package SYP.MusicPlayer;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

/**
 * Created by maxim-mac on 13/05/2017.
 */
public class Midi {
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
