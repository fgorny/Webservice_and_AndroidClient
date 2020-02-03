package com.example.myfirstapp;

public class Question {

    public String questions[] = {
            "Pytanie 1?",
            "Pytanie 2?",
            "Pytanie 3?"
    };

    public String choices[][] = {
            {"odp1", "odp2", "odp3"},
            {"odp1", "odp2", "odp3"},
            {"odp1", "odp2", "odp3"}
    };

    public String correctAnswer[] = {
            "odp1",
            "odp2",
            "odp3"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice =  choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice =  choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice =  choices[a][2];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

}



