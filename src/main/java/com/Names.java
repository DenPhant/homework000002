package com;

import java.util.Random;

public class Names {
    private String[] names;
    private int pages;
    private String[] author;
    public String getNameRand(int index){
        names[1]="Gandalf Potter";
        names[2]="Voidio";
        names[3]="Panderia";
        names[4]="Game Of Taburetka";
        names[6]="Groot";
        names[7]="Hungry games";
        names[8]="Very not normal";
        names[9]="I ran out of ideas";
        names[10]="I'm not proud of myself";
        names[11]="Spooky";
        names[12]="10 reasons to quit programming";
        names[13]="Minecraft tutorial";
        names[14]="How to train your hamster";
        names[15]="Why birds aren't real";
        names[16]="History of a great stoner";
        names[17]="Fairy tales to kids";
        names[18]="I hate my keyboard";
        names[19]="Another 10 reasons to quit programming";
        names[20]="420-magical number";
        return names[index];
    }
    public int getPagesRand(){
        Random random = new Random(  );
        pages=random.nextInt(101)+50;
        return pages;
    }
    public String getAuthorRand(int index){
        author[1]="J.K.Mlem";
        author[2]="R.Noname";
        author[3]="B.P.Kennedie";
        author[4]="G.Leb";
        author[5]="L.Jenkins";
        author[6]="S.Lee";
        author[7]="L.See";
        author[8]="K.Marx";
        author[9]="A.Stalin";
        author[10]="D.J.Putout";
        author[11]="G.Me";
        author[12]="T.Ideas";
        author[13]="E.Kalns";
        author[14]="B.Kode";
        author[15]="B.Kodi";
        author[16]="K.Hater";
        author[17]="D.Skrillex";
        author[18]="K.KMS";
        author[19]="Q.Legit";
        author[20]="A.Instance";
        return author[index];
    }
}
