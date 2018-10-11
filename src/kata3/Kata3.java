package kata3;

public class Kata3 {

    private static Histogram<String> histogram = new Histogram();
    
    public static void main(String[] args) {
        histogram.increment("ulpgc.es");
        histogram.increment("google.com");
        histogram.increment("outlook.com");
        histogram.increment("google.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.es");
        histogram.increment("google.com");
        histogram.increment("google.com");
        
        new HistogramDisplay(histogram).execute();
    }
}