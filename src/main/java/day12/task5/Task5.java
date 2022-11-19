package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List <MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Вася",20));
        members1.add(new MusicArtist("Петя",21));

        MusicBand bandA = new MusicBand("Гитаристы",2020,members1);
        System.out.print("1я группа: ");
        bandA.printMembers();

        List <MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Катя",22));
        members2.add(new MusicArtist("Маша",23));

        MusicBand bandB = new MusicBand("Певцы",2021,members2);
        System.out.print("2я группа: ");
        bandB.printMembers();

        MusicBand.transferMembers(bandA,bandB);
        bandA.printMembers();
        bandB.printMembers();



    }
}
