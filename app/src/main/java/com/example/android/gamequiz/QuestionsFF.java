package com.example.android.gamequiz;

public class QuestionsFF {
    //image array
    Integer[] imageID = {
            R.drawable.dragoon,
            R.drawable.limsa,
            R.drawable.holy,
            R.drawable.miqote,
            R.drawable.lalafell,
            R.drawable.choco,
            R.drawable.paladin,
    };
    //Questions Array
    private String Questions[] = {
            "Question #1: Which of the following is not a tanking class?",
            "Question #2: This flag belongs to:",
            "Question #3: The holy spell belongs to:",
            "Question #4: Name the race",
            "Question #5: Name the race",
            "Question #6: Which animal is that?",
            "Question #7: Who has the flash ability?",
    };
    //Answers array
    private String Choices[][] = {
            {"Paladin", "Dark Knight", "Dragoon"},
            {"Ul'dah", "Limsa Lominsa", "Ishgard"},
            {"Astrologian", "Scholar ", "White Mage"},
            {"Au Ra", "Miqo'te", "Lalafell" },
            {"Elezen", "Lalafell", "Roegadyn" },
            {"Coeurl", "Coeurl", "Chocobo" },
            {"Dark Knight", "Paladin", "Rogue" },
    };
    //Correct answers array
    private String CorrectAnswers[] = {"Dragoon", "Limsa Lominsa", "White Mage", "Miqo'te", "Lalafell", "Chocobo", "Paladin"};

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