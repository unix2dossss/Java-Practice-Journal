public class rugbyClassQ1 {
    // import stuff
	public static void main(String[] args) {
        // Test Cases Go Here
        Rugby t =new Rugby("New Zealand");
        t.setTotalPoints(19);
        System.out.println(t);

}
}

class Rugby {
    private String countryName;
    private int totalPoints;

    public Rugby(String countryName, Integer totalPoints){
        this.countryName = countryName;
        this.totalPoints = totalPoints;
    }

    public Rugby(){
        this("N/A", 0);
    }

    public Rugby(String countryName){
        this(countryName, 0);
    }

    public String toString() {
        return String.format("Country: %s(%s)", countryName, totalPoints);
    }
    
    public String getCountryName(){
        return countryName;
    }
    
    public Integer getTotalPoints(){
        return totalPoints;
    }

    public void setCountryName(String name){
        this.countryName = name;
    }

    public void setTotalPoints(int p){
        if (p>=0){
            this.totalPoints = p;
        }
    }

}