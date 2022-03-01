package mketour.actors;

public class BusSearch extends WordSearch{

    private String B = "*";
    private String U = "*";
    private String S = "*";


    /**
     * Does search for Bus
     * @param ID
     * @return String for found letters in BUS
     */
    @Override
    public String search(String ID) {
        if (ID.contains("B")){
            B = "B";
        }
        if (ID.contains("U")){
            U = "U";
        }
        if (ID.contains("S")){
            S = "S";

        }
        return B + U + S;
    }
}
