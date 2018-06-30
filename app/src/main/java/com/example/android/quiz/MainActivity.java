package com.example.android.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int quantity, score = 0;
    int score1, score2, score3, score4, score5, score6, score7, score8, score9, score10;
    String totalScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the quiz is submitted. Email App is initiated.
     */
    public void submitQuiz(View view) {

        // Is the button now checked?
        RadioButton oracle = (RadioButton) findViewById(R.id.radioOracle);
        boolean oracleState = oracle.isChecked();
        if (oracleState) {
            score1 = 0;
            oracle.setBackgroundColor(Color.parseColor("#FF0000"));
        }

        RadioButton google = (RadioButton) findViewById(R.id.radioGoogle);
        boolean googleState = google.isChecked();
        if (googleState) {
            score2 = score + 1;
            google.setBackgroundColor(Color.parseColor("#00FF00"));
        }

        CheckBox cycling = (CheckBox) findViewById(R.id.checkboxView2_1);
        boolean beenCycling = cycling.isChecked();
        if (beenCycling) {
            score3 = 0;
            cycling.setBackgroundColor(Color.parseColor("#FF0000"));
        }

        CheckBox searching = (CheckBox) findViewById(R.id.checkboxView2_2);
        boolean beenSearching = searching.isChecked();
        if (beenSearching) {
            score4 = score + 1;
            searching.setBackgroundColor(Color.parseColor("#00FF00"));
        }

        RadioButton srt = (RadioButton) findViewById(R.id.aiButton);
        boolean srtState = srt.isChecked();
        if (srtState) {
            score5 = score + 1;
            srt.setBackgroundColor(Color.parseColor("#00FF00"));
        }

        RadioButton study = (RadioButton) findViewById(R.id.studyButton);
        boolean studyState = study.isChecked();
        if (studyState) {
            score6 = 0;
            study.setBackgroundColor(Color.parseColor("#FF0000"));
        }

        RadioButton five = (RadioButton) findViewById(R.id.fiveButton);
        boolean fiveState = five.isChecked();
        if (fiveState) {
            score7 = score + 1;
            five.setBackgroundColor(Color.parseColor("#00FF00"));
        }

        RadioButton two = (RadioButton) findViewById(R.id.twoButton);
        boolean twoState = two.isChecked();
        if (twoState) {
            score8 = 0;
            two.setBackgroundColor(Color.parseColor("#FF0000"));
        }

        RadioButton yes = (RadioButton) findViewById(R.id.yesButton);
        boolean yesState = yes.isChecked();
        if (yesState) {
            score9 = score + 1;
            yes.setBackgroundColor(Color.parseColor("#00FF00"));
        }

        RadioButton no = (RadioButton) findViewById(R.id.noButton);
        boolean noState = no.isChecked();
        if (noState) {
            score10 = 0;
            no.setBackgroundColor(Color.parseColor("#FF0000"));
        }
        String totalScores = createSummary(score);
        displayResults(totalScores);
    }

    private String createSummary(int scores) {
        scores = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
        String Message = "Total Score is : " + scores + " / 5";
        return Message;
    }

    private void displayResults(String value) {
        TextView SummaryTextView = (TextView) findViewById(R.id.summaryView);
        SummaryTextView.setText(value);
    }

}