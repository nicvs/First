package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand("Гитаристы",2020);
        List <String> membersBandA = new ArrayList<>(Arrays.asList("Вася","Петя","Коля"));
        bandA.addMembers(membersBandA);
        bandA.printMembers();

        List <String> membersBandB = new ArrayList<>();
        membersBandB.add("Катя");
        membersBandB.add("Маша");

        MusicBand bandB = new MusicBand("Певцы",2021,membersBandB);
        bandB.printMembers();

        MusicBand.transferMembers(bandA,bandB);

        bandA.printMembers();
        bandB.printMembers();
    }

}
