import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.time.*; // could maybe use later

public class ParkingSpot {
    private String address;
    private String startTime;
    private String endTime;
    private String type;
    private String specialInstructions;
    private int numSpots;
    private boolean XL;
    private int numXL;

    public ParkingSpot(String address, String type) {
        this.address = address;
        // TODO: find a way to get latitude and longitude coordinates
        this.startTime = "00:00 AM";
        this.endTime = "00:00 AM";
        this.type = type;
        this.specialInstructions = ""; //Default: no special instructions
        this.numSpots = 1;
        this.XL = false;
        this.numXL = 0;
    }

    public void setAvailability(String start, String end) {
        SimpleDateFormat s = new SimpleDateFormat(start);
        SimpleDateFormat e = new SimpleDateFormat(end);
        this.startTime = s.toPattern();
        this.endTime = e.toPattern();
        // TODO: instead of an arraylist, try making a time range
    }

    public void setSpecialInstructions(String instructions) {
        this.specialInstructions = instructions;
    }

    public void addXL(int xl) {
        this.numXL += xl;
    }

    // all the "get" methods are below:

    public String getType() {
        return this.type;
    }

    public String getAddress() {
        return this.address;
    }
    // TODO: use getAddress() to make methods for getting latitude and longitude

    public ArrayList<String> getTimeFrame() {
        ArrayList<String> time = new ArrayList<String>();
        time.add(this.startTime);
        time.add(this.endTime);
        return time;
    }
    public String getInstructions() {
        return this.specialInstructions;
    }
    public int getNumSpots() {
        return this.numSpots;
    }

    public int getNumXL() {
        return this.numXL;
    }

    public boolean hasXL() {
        return this.XL;
    }

}