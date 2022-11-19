package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List <MusicArtist> members;

    public MusicBand(String name, int year, List <MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public static void transferMembers (MusicBand a, MusicBand b){
        for (MusicArtist member : a.getMembers())
            b.getMembers().add(member);

        a.getMembers().clear();
    }


    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers(){
        if (members.size() == 0){
            System.out.println("Участников нет");
            return;
        }
        System.out.print("Участники: ");
        System.out.println(members);
    }

}

