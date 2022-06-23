import javax.crypto.interfaces.PBEKey;

interface Sound {
    public void SoundUp(int Level);

    public void SoundDown(int Level);
}

class TV implements Sound {
    private int SndLevel;

    public TV() {
        SndLevel = 0;
    }

    public void SoundUp(int Level) {
        SndLevel += Level;
    }

    public void SoundDown(int Level) {
        SndLevel += Level;
        if (SndLevel < 0)
            SndLevel = 0;
    }
}

class Radio implements Sound {
    private int SndLevel;

    public Radio() {
        SndLevel = 0;
    }

    public void SoundUp(int Level) {
        SndLevel += Level;
    }

    public void SoundDown(int Level) {
        SndLevel += Level;
        if (SndLevel < 0)
            SndLevel = 0;
    }

}

public class SoundExam {
    public static void main(String[] args) {
        Sound radio = new Radio();
        Sound TV = new TV();
        radio.SoundUp(5);
        TV.SoundUp(5);
    }
}
