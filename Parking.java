import java.util.ArrayList;

class Parking {
    private String name;
    private double priceForSecond = 0;
    private ArrayList<String> whiteList = new ArrayList<String>();
    private ArrayList<Break> breaks = new ArrayList<>();

    public Parking(String name, double priceForSecond) {
        this.name = name;
        this.priceForSecond = priceForSecond;
    }

    public void addPlateToWhiteList(String plate) {
        if (!this.whiteList.contains(plate)) {
            this.whiteList.add(plate);
        }
    }

    public void addBreak(String plate) {
        Break b = new Break(plate);
        this.breaks.add(b);
    }

    public void stopBreak(String plate) {
        for (Break iesimBreak : this.breaks) {
            if (plate == iesimBreak.getPlate()) {
                iesimBreak.setStop();
                return;
            }
        }
    }

    public String toString() {
        String response = this.name + " whiteList: [";
        for (String plate : this.whiteList) {
            response += plate + " ";
        }
        response += "] \n";
        response += "breaks: [";
        for (Break breakIesim : this.breaks) {
            response += breakIesim.toString() + "\n";
            response += "price:" + breakIesim.getPrice(this.priceForSecond);
        }
        response += "]";
        return response;
    }

}