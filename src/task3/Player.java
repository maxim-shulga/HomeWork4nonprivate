package task3;

public class Player implements Playable, Recodable {
    public void play() {
        System.out.println("Track is played");
    }
    public void pause(){
        System.out.println("Track is paused");
    }
    public void stop(){
        System.out.println("Playback is stopped");
    }
    public void record(){
        System.out.println("Recording started");
    }
}
