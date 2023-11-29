public class Adress {
    private String district;
    private String city;

    public Adress(String district, String city) {
        this.district = district;
        this.city = city;
    }

    public Adress() {
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
//        return " District : " + this.getDistrict() + " City : " + this.getCity();
      return   String.format("%-15s %-15s" , this.getDistrict() ,this.getCity());
    }
}
