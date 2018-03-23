package com.example.android.gamequiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

//source: https://androidcookbook.com/Recipe.seam;jsessionid=E29F9B569793C059A30F20AA3F5A5C0C?recipeId=697
public class MainActivityPlaystation extends AppCompatActivity {
    private TextView txtRadio;
    private CheckBox chkBox1_Q9;
    private CheckBox chkBox3_Q9;
    private CheckBox chkBox2_Q9;
    private CheckBox chkBox1_Q5;
    private CheckBox chkBox2_Q5;
    private CheckBox chkBox3_Q6;
    private CheckBox chkBox2_Q6;
    private CheckBox chkBox1_Q6;
    private CheckBox chkBox3_Q5;
    final String q7_Answer_option1 = "Geralt";
    final String q7_Answer_option2 = "Geralt of Rivia";
    final String q8_Answer = "Ciri";
    final String q4_Answer_option1 = "PlayStation Move";
    final String q4_Answer_option2 = "Playstation Move";
    int count;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps);
        txtRadio = (TextView) findViewById(R.id.txtRadio);
    }

    //If all of the checkboxes were selected, return true
    private boolean checkQuestion9() {
        chkBox1_Q9 = (CheckBox) findViewById(R.id.chkBox1_Q9);
        chkBox2_Q9 = (CheckBox) findViewById(R.id.chkBox2_Q9);
        chkBox3_Q9 = (CheckBox) findViewById(R.id.chkBox3_Q9);
        if (chkBox1_Q9.isChecked() && chkBox2_Q9.isChecked() && chkBox3_Q9.isChecked()) {
            return true;
        }
        return false;
    }

    //If the 1st & 2nd checkbox was selected, return true
    private boolean checkQuestion5() {
        chkBox1_Q5 = (CheckBox) findViewById(R.id.chkBox1_Q5);
        chkBox2_Q5 = (CheckBox) findViewById(R.id.chkBox2_Q5);
        chkBox3_Q5 = (CheckBox) findViewById(R.id.chkBox3_Q5);
        if (chkBox1_Q5.isChecked() && chkBox2_Q5.isChecked() && !chkBox3_Q5.isChecked()) {
            return true;
        }
        return false;
    }

    //Checking the 6th question and returning true if checkbox 2 and 3 were selected
    private boolean checkQuestion6() {
        chkBox3_Q6 = (CheckBox) findViewById(R.id.chkBox3_Q6);
        chkBox2_Q6 = (CheckBox) findViewById(R.id.chkBox2_Q6);
        chkBox1_Q6 = (CheckBox) findViewById(R.id.chkBox1_Q6);
        if (chkBox3_Q6.isChecked() && !chkBox1_Q6.isChecked() && chkBox2_Q6.isChecked()) {
            return true;
        }
        return false;
    }

    @NonNull
    private String checkQuestion7() {
        EditText text_question_7 = (EditText) findViewById(R.id.text_Q7);
        return text_question_7.getText().toString();
    }

    @NonNull
    private String checkQuestion8() {
        EditText text_question_8 = (EditText) findViewById(R.id.text_Q8);
        return text_question_8.getText().toString();
    }

    @NonNull
    private String checkQuestion4() {
        EditText text_question_4 = (EditText) findViewById(R.id.text_Q4);
        return text_question_4.getText().toString();
    }

    public void getCorrectAnswers() {

        RadioButton radio1_Q1 = (RadioButton) findViewById(R.id.radio1_Q1);
        radio1_Q1.setChecked(true);
        RadioButton radio3_Q2 = (RadioButton) findViewById(R.id.radio3_Q2);
        radio3_Q2.setChecked(true);
        RadioButton radio3_Q3 = (RadioButton) findViewById(R.id.radio3_Q3);
        radio3_Q3.setChecked(true);
        EditText text_Q4 = (EditText) findViewById(R.id.text_Q4);
        text_Q4.setText("Playstation Move");
        CheckBox chkBox2_Q5 = (CheckBox) findViewById(R.id.chkBox2_Q5);
        chkBox2_Q5.setChecked(true);
        CheckBox chkBox1_Q5 = (CheckBox) findViewById(R.id.chkBox1_Q5);
        chkBox1_Q5.setChecked(true);
        CheckBox chkBox2_Q6 = (CheckBox) findViewById(R.id.chkBox2_Q6);
        chkBox2_Q6.setChecked(true);
        CheckBox chkBox3_Q6 = (CheckBox) findViewById(R.id.chkBox3_Q6);
        chkBox3_Q6.setChecked(true);
        EditText text_Q7 = (EditText) findViewById(R.id.text_Q7);
        text_Q7.setText("Geralt");
        EditText text_Q8 = (EditText) findViewById(R.id.text_Q8);
        text_Q8.setText("Ciri");
        CheckBox chkBox1_Q9 = (CheckBox) findViewById(R.id.chkBox1_Q9);
        chkBox1_Q9.setChecked(true);
        CheckBox chkBox2_Q9 = (CheckBox) findViewById(R.id.chkBox2_Q9);
        chkBox2_Q9.setChecked(true);
        CheckBox chkBox3_Q9 = (CheckBox) findViewById(R.id.chkBox3_Q9);
        chkBox3_Q9.setChecked(true);
        Toast.makeText(MainActivityPlaystation.this, "Correct Answers has been filled", Toast.LENGTH_LONG).show();
    }

    public void submitButton(View view) {
        RadioButton radio1_Q1 = (RadioButton) findViewById(R.id.radio1_Q1);
        if (radio1_Q1.isChecked()) {
            count++;
        }
        RadioButton radio3_q2 = (RadioButton) findViewById(R.id.radio3_Q2);
        if (radio3_q2.isChecked()) {
            count++;
        }
        RadioButton radio3_q3 = (RadioButton) findViewById(R.id.radio3_Q3);
        if (radio3_q3.isChecked()) {
            count++;
        }
        if (checkQuestion4().equals(q4_Answer_option1) || checkQuestion4().equals(q4_Answer_option2)) {
            count++;
        }
        if (checkQuestion5()) {
            count++;
        }
        if (checkQuestion6()) {
            count++;
        }
        if (checkQuestion7().equals(q7_Answer_option1) || checkQuestion7().equals(q7_Answer_option2)) {
            count++;
        }
        if (checkQuestion8().equals(q8_Answer)) {
            count++;
        }
        if (checkQuestion9()) {
            count++;
        }
        Toast.makeText(MainActivityPlaystation.this, "You've got " + count + " correct answers", Toast.LENGTH_LONG).show();
        txtRadio.setText("You've got " + count + " correct answers");
        txtRadio.getResources().getString(R.string.get_score);
        count = 0;
    }

    //Menu
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.back) {
            Intent i = new Intent(MainActivityPlaystation.this, MainActivity.class);
            startActivity(i);
        }
        if (id == R.id.reset) {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
        if (id == R.id.answers) {
            getCorrectAnswers();
        }
        return super.onOptionsItemSelected(item);
    }
}