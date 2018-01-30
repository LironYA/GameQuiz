package com.example.android.gamequiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityPC extends AppCompatActivity {

        QuestionLibrary questionLibrary = new QuestionLibrary();

        private TextView scoreView;
        private TextView questionView;
        private Button buttonChoice1;
        private Button buttonChoice2;
        private Button buttonChoice3;
        private ImageView imageView;
        private String mAnswer;
        private int mScore = 0;
        private int mQuesNumber = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pc);
            imageView =  (ImageView)findViewById(R.id.picture);
            scoreView = (TextView)findViewById(R.id.score);
            questionView = (TextView)findViewById(R.id.question);
            buttonChoice1 = (Button)findViewById(R.id.choice1);
            buttonChoice2 = (Button)findViewById(R.id.choice2);
            buttonChoice3 = (Button)findViewById(R.id.choice3);

            updateQuestion();

            //Start of button listener for button1
            buttonChoice1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    //Logic for button click
                    if(buttonChoice1.getText() == mAnswer){
                        mScore++;
                        updateScore(mScore);
                        updateQuestion();
                    }else{
                        updateQuestion();
                    }
                }
            });

            //Start of button listener for button2
            buttonChoice2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    //Logic for button click
                    if(buttonChoice2.getText() == mAnswer){
                        mScore++;
                        updateScore(mScore);
                        updateQuestion();
                    }else{
                        updateQuestion();
                    }
                }
            });

            //Start of button listener for button3
            buttonChoice3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    //Logic for button click
                    if(buttonChoice3.getText() == mAnswer){
                        mScore++;
                        updateScore(mScore);
                        updateQuestion();
                    }else{
                        updateQuestion();
                    }
                }
            });
        }
        private void updateQuestion() {
            if(questionLibrary.getQuesArrayLength() > mQuesNumber) {
                questionView.setText(questionLibrary.getQuestion(mQuesNumber));
                buttonChoice1.setText(questionLibrary.getChoice1(mQuesNumber));
                buttonChoice2.setText(questionLibrary.getChoice2(mQuesNumber));
                imageView.setImageResource(questionLibrary.displayImage2());
                imageView.setImageResource(questionLibrary.displayImage1(mQuesNumber));
                buttonChoice3.setText(questionLibrary.getChoice3(mQuesNumber));
                mAnswer = questionLibrary.getCorrectAnswer(mQuesNumber);
                mQuesNumber++;
            }
            else {
                Toast.makeText(MainActivityPC.this,"End of PC quiz\n You've got " + mScore + " out of 7 correct answers", Toast.LENGTH_LONG).show();
                finish();
        }}
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.back) {
            Intent i = new Intent(MainActivityPC.this, MainActivity.class);
            startActivity(i);
        }
        if (id == R.id.reset) {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
        private void updateScore(int mScore) {
            scoreView.setText("Score: " + mScore + " out of 7 ");
        }
    }