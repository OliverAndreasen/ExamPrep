package com.company;
import java.util.ArrayList;
import java.util.Objects;

public class Keyword {

    private final String word;
    private final String definition;
    private final ArrayList<String> relatedKeywords = new ArrayList<>();

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;

    }

    public boolean matches(String search) {
        return Objects.equals(search, word);
    }

    public ArrayList seeAlso() {
        return relatedKeywords;
    }

    public void addRelatedKeyword(String keyword) {
        relatedKeywords.add(keyword);
    }

    public void removeRelatedKeyword(String keyword) {
        relatedKeywords.remove(keyword);
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", relatedKeywords=" + relatedKeywords +
                '}';
    }
}
