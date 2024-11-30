/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.sound.midi.*;

/**
 *
 * @author NIRAV
 */
public class Thread2 extends Thread{
     @Override
    public void run() {
        playNotes(new int[]{62, 65, 69, 72}); // "re", "fa", "la", "do-octave"
    }

    private void playNotes(int[] notes) {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            int duration = 400;

            for (int note : notes) {
                System.out.println("Thread2 playing: " + note);
                channels[0].noteOn(note, 600);
                Thread.sleep(duration);
                channels[0].noteOff(note);
            }
            synth.close();
            System.out.println("Thread 1 music done" + notes);
        } catch (Exception e) {
            System.out.println("Thread2 error: " + e.getMessage());
        }
}
}
