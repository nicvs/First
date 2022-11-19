package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List <MusicBand> allbands = new ArrayList<>();
        allbands.add(new MusicBand("RHCP",1983));
        allbands.add(new MusicBand("Oasis",1991));
        allbands.add(new MusicBand("Wu-Tang Clan",1992));
        allbands.add(new MusicBand("План Ломоносова",2010));
        allbands.add(new MusicBand("Daft Punk",1993));
        allbands.add(new MusicBand("Hot Chip",2010));
        allbands.add(new MusicBand("ABBA",1972));
        allbands.add(new MusicBand("The Kooks",2004));
        allbands.add(new MusicBand("The Supremes",1959));
        allbands.add(new MusicBand("Stray Kids",2017));

        System.out.println(allbands);
        System.out.println(groupsAfter2000(allbands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> allbands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
       /* for (int i = 0; i < allbands.size(); i++){
            if (allbands.get(i).getYear() > 2000){
                groupsAfter2000.add(allbands.get(i));
            }
        } */

        for (MusicBand musicBand:allbands){
            if (musicBand.getYear() > 2000 ){
                groupsAfter2000.add(musicBand);
            }
        }
        return groupsAfter2000;
    }

}
