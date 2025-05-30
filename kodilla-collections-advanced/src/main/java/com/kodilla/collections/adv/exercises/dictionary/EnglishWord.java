package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Objects;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word){
        this.partOfSpeech = partOfSpeech;
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return partOfSpeech == that.partOfSpeech && Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partOfSpeech, word);
    }

    public String getWord() {
        return word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }
}
