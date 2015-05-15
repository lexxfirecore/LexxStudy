package com.lexxstudy.spring_aop.common;

/**
 * Created by lexxfirecore on 5/15/2015.
 */

public class AmplifierService {

    Amplifier amplifier;

    void setDefaultSettings() {
        amplifier.setGain(43);
        amplifier.setVolume(10);
        amplifier.setLowEq(50);
        amplifier.setMidEq(63);
        amplifier.setHighEq(80);
        amplifier.setModel("Marshal JCM800");
    }


    public void raiseGain(int delta) {
        int newValue = doCorrection(amplifier.getGain() + delta);
        amplifier.setGain(newValue);
    }

    public void reduceGain(int delta) {
        int newValue = doCorrection(amplifier.getGain() - delta);
        amplifier.setGain(newValue);
    }

    public void raiseVolume(int delta) {
        int newValue = doCorrection(amplifier.getVolume() + delta);
        amplifier.setVolume(newValue);
    }

    public void reduceVolume(int delta) {
        int newValue = doCorrection(amplifier.getVolume() - delta);
        amplifier.setVolume(newValue);
    }


    // correction will allow only values 0..100
    private int doCorrection(int settingValue) {
        if (settingValue > 100) {
            return 100;
        } else {
            if (settingValue < 0) {
                return 0;
            } else return settingValue;
        }
    }

    // setter to change amplifier model
    public void setAmplifierModel(String modelName) {
        amplifier.setModel(modelName);
    }


    // setter will be used by Spring to inject amplifier bean
    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }


    public Amplifier getAmplifier() {
        return amplifier;
    }
}
