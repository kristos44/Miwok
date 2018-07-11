package com.example.android.miwok;

/**
 * Created by krzysztof on 07.03.18.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private int mSoundResourceId;

    public Word(String miwokTranslation, String defaultTranslation, int soundResourceId) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mSoundResourceId = soundResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int soundResourceId) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceId = imageResourceId;
        this.mSoundResourceId = soundResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }
}
