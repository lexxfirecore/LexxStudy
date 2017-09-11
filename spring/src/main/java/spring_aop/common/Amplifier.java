package spring_aop.common;

/**
 * Created by lexxfirecore on 5/15/2015.
 */

public class Amplifier {

    int gain;
    int volume;
    int lowEq;
    int midEq;
    int highEq;
    String model;

    public Amplifier() {
        this.gain = 1;
        this.volume = 10;
        this.lowEq = 1;
        this.midEq = 1;
        this.highEq = 1;
        this.model = "generic";
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLowEq() {
        return lowEq;
    }

    public void setLowEq(int lowEq) {
        this.lowEq = lowEq;
    }

    public int getMidEq() {
        return midEq;
    }

    public void setMidEq(int midEq) {
        this.midEq = midEq;
    }

    public int getHighEq() {
        return highEq;
    }

    public void setHighEq(int highEq) {
        this.highEq = highEq;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Model: " + this.model + ", ");
        sb.append("gain: " + this.gain + ", ");
        sb.append("volume: " + this.volume + ", ");
        sb.append("lowEq: " + this.lowEq + ", ");
        sb.append("midEq: " + this.midEq + ", ");
        sb.append("highEq: " + this.highEq + ".");
        return sb.toString();
    }

}
