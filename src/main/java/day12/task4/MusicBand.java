package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List <String> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List <String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void addMembers (List members){
        this.members = members;
    }


    public static void transferMembers (MusicBand a, MusicBand b){
        for (String member : a.getMembers())
            b.getMembers().add(member);

        a.getMembers().clear();
    }

    public int getYear() {
        return year;
    }
    public List<String> getMembers() {
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



    @Override
    public String toString() {
        return  name + " " + year + " Участники: "+ members;
    }


}
