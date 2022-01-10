package com.kodilla.collections.adv.exercises.dictionary;

public class EnglishWord {
    private PartOffSpeech partOffSpeech;
    private String word;

    public EnglishWord(PartOffSpeech partOffSpeech, String word){
        this.partOffSpeech = partOffSpeech;
        this.word = word;
    }

    public String getWord(){
        return word;
    }

    public PartOffSpeech getPartOffSpeech(){
        return partOffSpeech;
    }
}