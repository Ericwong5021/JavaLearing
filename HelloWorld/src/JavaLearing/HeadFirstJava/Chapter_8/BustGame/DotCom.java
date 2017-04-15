package Chapter_8.BustGame;


import java.util.ArrayList;

class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public void setName(String n) {
        name = n;
    }

    public String ckeckYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("You sunk " + name + "^_^");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

