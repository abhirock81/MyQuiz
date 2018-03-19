package com.example.a1605417.myquiz;

/**
 * Created by 1605417 on 04-Nov-17.
 */

public class Questions {


    String mque[]={"Where is the FERRARI factory located?","Rearrange the letters of the name SOCRATES to give two other eight letter words. What will be the first letter of both words?","What number should appear next in this sequence: " +
            "2,6,14,30,62,126?","A pet shop has 8 hamsters, 18 rabbits and 7 guinea pigs. How many dogs does it have?"};
    String mchoice[][]={{ "Maranello","New York","France","Galdiots"},
            {"T","R","C","S"},
            {"256","12","210","254"},
            {"15","4","8","9"}};
    String manswer[]={"Maranello","C","254","4"};

    public String mquestion(int a)
    {
        String question=mque[a];
        return question;
    }

    public String moption1(int a)
    {
        String option=mchoice[a][0];
        return option;
    }
    public String moption2(int a)
    {
        String option2=mchoice[a][1];
        return option2;
    }
    public String moption3(int a)
    {
        String option3=mchoice[a][2];
        return option3;
    }
    public String moption4(int a)
    {
        String option4=mchoice[a][3];
        return option4;
    }
    public String getanswer(int a)
    {
        String manswer1=manswer[a];
        return manswer1;
    }
}
