package HomeW_18;

import java.util.Arrays;
import java.util.List;

class MusicStyles{
    void playMusic() {

    }
}

class PopMusic extends MusicStyles{
    @Override
    public void playMusic(){
        System.out.println("Это поп!");
    }
}
class RockMusic extends MusicStyles{
    @Override
    public void playMusic(){
        System.out.println("Это рок!");
    }
}
class ClassicMusic extends MusicStyles{
    @Override
    public void playMusic(){
        System.out.println("Это классика!");
    }
}

public class musicMain {
    public static void main(String[] args) {
        MusicStyles pop = new PopMusic();
        MusicStyles rok = new RockMusic();
        MusicStyles classic = new ClassicMusic();
        List<MusicStyles> chosenStyle = Arrays.asList(pop, rok, classic);
        for (MusicStyles m : chosenStyle){
            m.playMusic();
        }
    }
}
