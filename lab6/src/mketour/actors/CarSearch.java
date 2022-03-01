package mketour.actors;

public class CarSearch extends WordSearch{

    private StringBuilder sb = new StringBuilder();
    private String M = "*";
    private String S = "*";
    private String O = "*";
    private String E = "*";

    /**
     * Does search for MSOE
     * @param ID
     * @return String of found letters
     */
    @Override
    public String search(String ID) {
        if (ID.contains("M")){
            M = "M";
        }
        if (ID.contains("S")){
            S = "S";
        }
        if (ID.contains("O")){
            O = "O";
        }
        if (ID.contains("E")){
            E = "E";
        }
        return M + S + O + E;
    }
}
