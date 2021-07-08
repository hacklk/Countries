public abstract class Locality {
    private String name;
    private String gps;
    private LocalityType type;

    public LocalityType geType(){
        return type;
    }

    public void setType(LocalityType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }
    public Locality(String nm){
        this.name = nm;

    }
}
