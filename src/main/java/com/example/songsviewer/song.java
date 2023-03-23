package com.example.songsviewer;

import java.io.File;
import java.util.Scanner;

public class song extends music {

    private String Artist;


    public song(String name, float interactions, String released, String artist) {
        super(name, interactions, released);
        Artist = artist;

    }

    static void readAllData() throws Exception {
        Scanner sc = new Scanner(new File("src/main/java/com/example/songsviewer/songdata"));
        while (sc.hasNext()) {
            String str = sc.nextLine();
            Scanner lineScanner = new Scanner(str);
            lineScanner.useDelimiter("\t");

            System.out.println(str);
            // Bing Crosby	"White Christmas"	1942	50	[1]
            //   artist        name             released    interactions
            //   String name, float interactions, String released, String artist

            String name = lineScanner.next();
            //name not being used but ranking
            String nameClean = name.replace("\"","");
            int firstBracketLocation = nameClean.indexOf("[");
            if (firstBracketLocation >= 0) {
                nameClean = nameClean.substring(0, firstBracketLocation);
            }

            String artist = lineScanner.next();

            float interactions = lineScanner.nextFloat();

            String released = lineScanner.next();

            new song(name,interactions,released,artist);
        }
        sc.close();
    }


    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }


    public String toString() {
    return getName() + " was created by " + getArtist() + ". It was released in the year " + getReleased() + ". It had " + getInteractions() + "views.";
    }
}