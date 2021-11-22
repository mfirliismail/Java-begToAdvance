class Motorcycle {

    public static final int price = 10000;
    private String type;

    public String getType(){
        return type;
    }

    public String getRevenueData(){
        String data = "Revenue:" + calculateRevenue();
        return data;
    }

    private int calculateRevenue(){
        return 12000;
    }

    public void setType(String type){
        this.type = type;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        
    }
}
