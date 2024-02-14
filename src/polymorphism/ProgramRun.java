package polymorphism;

import java.util.stream.Stream;

public class ProgramRun {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = new MusicStyles[]{
                new ClassicMusic(),
                new PopMusic(),
                new RockMusic()
        };

        Stream.of(musicStyles).forEach(MusicStyles::playMusic);
    }
}
