import java.io.Serializable;

/**
 * EarthquakeMonitoring
 * Earthquake
 * Class to specify earthquake, which has 3 fields to represent magnitude, position and year of the earthquake
 *
 * @author Yixiong J
 * @version 2019/10/14-14:13
 */
public class Earthquake implements Comparable<Earthquake> , Serializable {
    private double mag;
    private double[] pos;
    private int year;
    private static final long serialVersionUID = 10L;

    /**
     * Constructor for initialization of earthquake object, which takes 4 params and assign these to fields.
     *
     * @param mag  magnitude of the earthquake
     * @param lat  latitude of the earthquake
     * @param lon  longitude of the earthquake
     * @param year the year of the earthquake
     * @author Yixiong J
     */
    public Earthquake(double mag, double lat, double lon, int year) {
        this.mag = mag;
        this.pos = new double[]{lat, lon};
        this.year = year;
    }

    /**
     * Getter of {@code mag}
     *
     * @return the value of {@code mag}
     * @author Yixiong J
     */
    public double getMag() {
        return mag;
    }

    /**
     * setter of {@code mag}
     *
     * @param mag magnitude to be set
     * @author Yixiong J
     */
    public void setMag(double mag) {
        this.mag = mag;
    }

    /**
     * Getter of {@code pos}
     *
     * @return the value of {@code pos}
     * @author Yixiong J
     */
    public double[] getPos() {
        return pos;
    }

    /**
     * Setter of {@code pos}
     *
     * @param lat new latitude to be set
     * @param lon new longitude to be set
     * @author Yixiong J
     */
    public void setPos(double lat, double lon) {
        pos[0] = lat;
        pos[1] = lon;
    }

    /**
     * Getter of {@code year}
     *
     * @return the value of {@code year}
     * @author Yixiong J
     */
    public int getYear() {
        return year;
    }

    /**
     * setter of {@code year}
     *
     * @param year year to be set
     * @author Yixiong J
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Override {@code compareTO()} method, when magnitude of this earthquake is bigger than another, return 1; if they are equal, return 0; else, return -1.
     *
     * @param eq earthquake to be compared to illuminate which earthquake has greater magnitude.
     * @return return 1,0 or -1 to
     * @author Yixiong J
     */
    @Override
    public int compareTo(Earthquake eq) {
        return Double.compare(this.getMag(), eq.getMag());
    }

    /**
     * Override {@code toString} method, to convert earthquake object to readable text,
     * like "|Magnitude: 5.5    |Position: 101.5,30.3   |Year: 2019"
     *
     * @return A formatted String describes this earthquake
     * @author Yixiong J
     */
    @Override
    public String toString() {
        return "Magnitude: " + String.format("%.1f",mag) + "\tPosition: " + String.format("%-14s",pos[0] + "," + pos[1]) + "\tYear:" + year;
    }

}
