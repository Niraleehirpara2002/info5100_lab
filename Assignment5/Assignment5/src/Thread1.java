/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.sound.midi.*;
/**
 *
 * @author NIRAV
 */
public class Thread1 extends Thread {
      @Override
    public void run() {
        try {
            // Initialize the synthesizer for sound generation
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();

            // MIDI note numbers for "do", "mi", "sol", "si", "do-octave"
            int[] notes = {60, 64, 67, 71, 72}; // C, E, G, B, high C
            int duration = 400; // Duration in milliseconds

            for (int note : notes) {
                channels[0].noteOn(note, 600); // Start the note
                Thread.sleep(duration);       // Hold the note for 400ms
                channels[0].noteOff(note);    // Stop the note
            }

            synth.close(); // Close the synthesizer
            System.out.println("Thread 1 music done" + notes);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
}
}