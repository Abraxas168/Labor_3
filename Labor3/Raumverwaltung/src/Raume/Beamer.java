package Raume;

public class Beamer {
    private String hersteller;
    private String status;

    public Beamer(String hersteller, String status){
        this.hersteller=hersteller;
        this.status=status;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString()  {
          return hersteller+ " - Status: " + status;
    }
}
