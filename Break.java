import java.util.Date;

class Break {
    private String plate;
    private long start = 0;
    private long stop = 0;

    public Break(String plate, long start) {
        this.plate = plate;
        this.start = start;
    }

    public Break(String plate) {
        this.plate = plate;
        Date d = new Date();
        this.start = d.getTime();
    }

    public void setStop() {
        Date d = new Date();
        this.stop = d.getTime();
    }

    public void setStop(long stop) {
        this.stop = stop;
    }

    public String getPlate() {
        return this.plate;
    }

    public double getPrice(double priceForSecond) {
        if (this.stop == 0) {
            return 0;
        }
        return ((this.stop - this.start) / 1000) * priceForSecond;
    }

    public String toString() {
        String response = "plate:" + this.plate + "\n" +
                "start:" + this.start + "\n";
        if (this.stop != 0) {
            response += "stop: " + this.stop + "\n";
            response += "difference: " + (this.stop - this.start);
        }
        return response;
    }

}