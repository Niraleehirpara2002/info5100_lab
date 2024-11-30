import javax.sound.midi.*;

public class TwinkleTwinkle extends Thread{
    @Override
    public void run() {
        playNotes(new int[]{ 60, 60, 67, 67, 69, 69, 67, 65, 65, 64, 64, 62, 62, 60, // First line of the song
            67, 67, 65, 65, 64, 64, 62, 67, 67, 65, 65, 64, 64, 62, // Second line of the song
            60, 60, 67, 67, 69, 69, 67, 65, 65, 64, 64, 62, 62, 60  }); // "re", "fa", "la", "do-octave"
    }

    private void playNotes(int[] notes) {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            int duration = 400;

            for (int note : notes) {
                System.out.println("Thread3 playing: " + note);
                channels[0].noteOn(note, 600);
                Thread.sleep(duration);
                channels[0].noteOff(note);
            }
            synth.close();
        } catch (Exception e) {
            System.out.println("Thread3 error: " + e.getMessage());
        }
    }
}
