public class PlayerModel {

    private String image;
    private String name;

    public PlayerModel(int i) {
        if (i == 1) {// Gary
            image = "Gary.png";
            name = "Gary";
        } else if (i == 2) {// Big Chungus
            image = "BigChungus.png";
            name = "Big Chungus";
        } else if (i == 3) {// Ugandan Knuckles
            image = "UgandanKnuckles.png";
            name = "Ugandan Knuckles";
        } else if (i == 4) {// Ugandan Chungus
            image = "UgandanChungus.png";
            name = "Ugandan Chungles";
        } else if (i == 5) {// Rick
            image = "Gary.png";
            name = "Rick";
        } else if (i == 6) {// Morty
            image = "Morty.png";
            name = "Morty";
        } else if (i == 7) {// Waluigi
            image = "Waluigi.png";
            name = "Waluigi";
        } else {// Pewdiepie
            image = "Pewdiepie.png";
            name = "Pewds";
        }
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}