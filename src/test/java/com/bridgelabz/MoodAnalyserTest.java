package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    /**Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
    MoodAnalyser moodAnalyser=new MoodAnalyser();
    String result=moodAnalyser.analyzeMood("I am in sad mood");
    Assertions.assertEquals("SAD", result);//TC 1.1
    }**/

    @Test

    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result=moodAnalyser.analyzeMood("I am in happy");
        Assertions.assertEquals("HAPPY", result);//TC 1.2
    }




}