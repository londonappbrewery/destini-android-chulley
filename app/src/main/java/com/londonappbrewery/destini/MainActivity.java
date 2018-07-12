package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        TextView mStoryTextView;
        Button mButtonTop, mButtonBottom;
        int mStoryIndex = 0;

    private StoryAnswers[] mStoryBank = new StoryAnswers[] {
        new StoryAnswers(R.string.T1_Story,R.string.T1_Ans1, R.string.T1_Ans2),
        new StoryAnswers(R.string.T2_Story,R.string.T2_Ans1, R.string.T2_Ans2),
        new StoryAnswers(R.string.T3_Story,R.string.T3_Ans1, R.string.T3_Ans2),
        new StoryAnswers(R.string.T4_End,0, 0),
        new StoryAnswers(R.string.T5_End,0, 0),
        new StoryAnswers(R.string.T6_End,0, 0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        getStory();


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 0 || mStoryIndex == 1) {
                    mStoryIndex = 2;
                    getStory();
                } else if (mStoryIndex == 2) {
                    mStoryIndex = 5;
                    getStory();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 0) {
                    mStoryIndex = 1;
                    getStory();
                } else if (mStoryIndex == 1) {
                    mStoryIndex = 3;
                    getStory();
                } else if (mStoryIndex == 2) {
                    mStoryIndex = 4;
                    getStory();
                }
            }
        });


    }

    private void getStory() {
        if (mStoryIndex <= 2) {
            mStoryTextView.setText(mStoryBank[mStoryIndex].getStory());
            mButtonTop.setText(mStoryBank[mStoryIndex].getAnswer1());
            mButtonBottom.setText(mStoryBank[mStoryIndex].getAnswer2());
        } else {
            mStoryTextView.setText(mStoryBank[mStoryIndex].getStory());
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
    }

}
