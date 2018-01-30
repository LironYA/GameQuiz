package com.example.android.gamequiz;

public class QuestionLibrary {
    //image array
    Integer[] imageID = {
            R.drawable.cain,
            R.drawable.wow,
            R.drawable.diablo2,
            R.drawable.moo,
            R.drawable.sims,
            R.drawable.doom,
            R.drawable.portal,
    };
    //Questions Array
    private String Questions[] = {
            "Question #1: \"Stay awhile and listen\". who said that?",
            "Question #2: What kind of game \"World of Warcraft\" is?",
            "Question #3: When was Diablo II published?",
            "Question #4: Which game included the secret cow level?",
            "Question #5: What kind of game \"The Sims\" is?",
            "Question #6: Which platform \"Doom\" was first released to?",
            "Question #7: Who are Portal's developers?",
    };
    //Answers array
    private String Choices[][] = {
            {"Lilith", "Mephisto", "Deckard Cain"},
            {"MMORPG", "RPG", "Shooter"},
            {"2002", "2000", "1999"},
            {"Diablo II", "StarCraft", "There is no such thing" },
            {"RPG", "Simulation", "Sports" },
            {"Super Nintendo", "Atari", "MS-DOS" },
            {"Blizzard", "Valve", "Microsoft" }
    };
    //Correct answers array
    private String CorrectAnswers[] = {"Deckard Cain", "MMORPG", "2000", "Diablo II", "Simulation", "MS-DOS", "Valve"};

    public String getQuestion(int questionNumber) {
        String question = Questions[questionNumber];
        return question;
    }

    public int displayImage1(int position) {
        return imageID[position];
    }

    public int displayImage2() {

        return imageID[1];
    }

    public String getChoice1(int choiceNumber)
    {
        String choice1 = Choices[choiceNumber][0];
        return  choice1;
    }

    public String getChoice2(int choiceNumber){
        String choice2 = Choices[choiceNumber][1];
        return  choice2;
    }

    public String getChoice3(int choiceNumber){
        String choice3 = Choices[choiceNumber][2];
        return  choice3;
    }

    public String getCorrectAnswer(int queNumber){
        String correctAns = CorrectAnswers[queNumber];
        return correctAns;
    }

    public int getQuesArrayLength(){
        return Questions.length;
    }
}