package com.londonappbrewery.destini;

public class StoryAnswers {

    private int mStory, mAnswer1, mAnswer2;

    public StoryAnswers(int story, int answer1, int answer2) {

        mStory = story;
        mAnswer1 = answer1;
        mAnswer2 = answer2;

    }

    public int getStory() {return mStory;}

    public void setStory(int story) {mStory = story;}

    public int getAnswer1() {return mAnswer1;}

    public void setAnswer1(int answer1) {mAnswer1 = answer1;}

    public int getAnswer2() {return mAnswer2;}

    public void setAnswer2(int answer2) {mAnswer2 = answer2;}

}
