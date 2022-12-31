import java.util.Random;

public class Notebook {
    String producer;    
    double screen_size;    
    int ozu;
    int hdd;   
    String system; 
    String colour;    
    String [] colours = {"черный", "белый", "розовый", "серый"};
    Notebook(String producer, double screen_size, int ozu, int hdd, String system){        
        this.producer = producer;
        this.screen_size = screen_size;
        this.ozu = ozu;
        this.hdd = hdd;
        this.system = system;
        Random random = new Random();
        colour = colours[random.nextInt(4)];        
    }

    public String getProducer() {
        return producer;
    }

    public Double getScreen_size() {
        return screen_size;
    }

    public Integer ozu() {
        return ozu;
    }
    
    public Integer hdd() {
        return hdd;
    }

    @Override
    public String toString() {        
        return (producer + " " + screen_size + " " + ozu + " " + hdd + " " + system + " " + colour);
    }
}
