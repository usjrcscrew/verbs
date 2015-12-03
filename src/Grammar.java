
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import simplenlg.framework.*;
import simplenlg.lexicon.*;
import simplenlg.realiser.english.*;
import simplenlg.phrasespec.*;
import simplenlg.features.*;

/**
 *
 * @auhor Nick
 */
public class Grammar {

    public static void main(String[] args) {
        pastTense("Wade", "rape", "fish");
        presentTense("Wade", "rape", "fish");
        futureTense("Wade", "rape", "fish");

    }

    public static String pastTense(String subject, String verb, String object) {
        Lexicon lexicon = Lexicon.getDefaultLexicon();
        NLGFactory nlgFactory = new NLGFactory(lexicon);
        Realiser realiser = new Realiser(lexicon);
        SPhraseSpec p = nlgFactory.createClause();
        p.setSubject(subject);
        p.setVerb(verb);
        p.setObject(object);
        p.setFeature(Feature.TENSE, Tense.PAST);
        String pastTense = realiser.realiseSentence(p); // Realiser created earlier.
        System.out.println("Past Tense: " + pastTense);

        return pastTense;
    }

    public static String presentTense(String subject, String verb, String object) {
        Lexicon lexicon = Lexicon.getDefaultLexicon();
        NLGFactory nlgFactory = new NLGFactory(lexicon);
        Realiser realiser = new Realiser(lexicon);
        SPhraseSpec p = nlgFactory.createClause();
        p.setSubject(subject);
        p.setVerb(verb);
        p.setObject(object);
        p.setFeature(Feature.TENSE, Tense.PRESENT);
        String presentTense = realiser.realiseSentence(p); // Realiser created earlier.
        System.out.println("Past Tense: " + presentTense);

        return presentTense;
    }

    public static String futureTense(String subject, String verb, String object) {
        Lexicon lexicon = Lexicon.getDefaultLexicon();
        NLGFactory nlgFactory = new NLGFactory(lexicon);
        Realiser realiser = new Realiser(lexicon);
        SPhraseSpec p = nlgFactory.createClause();
        p.setSubject(subject);
        p.setVerb(verb);
        p.setObject(object);
        p.setFeature(Feature.TENSE, Tense.FUTURE);
        String futureTense = realiser.realiseSentence(p); // Realiser created earlier.
        System.out.println("Past Tense: " + futureTense);

        return futureTense;
    }
}
