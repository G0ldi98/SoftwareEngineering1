package airplanePart;

public interface IAirplanePart {
    String version();
    String getID();
    void setAll(String ID, String type, String brand);
    void setIDandBrand(String ID, String brand);
}
