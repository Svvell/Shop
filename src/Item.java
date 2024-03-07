public class Item {
    private String name;
    private int cost;
    private double rate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        if(cost > 0) {
            this.cost = cost;
        }else{
            this.cost = 0;
        }
    }

    public int getCost() {
        return cost;
    }

    public void setRate(double rate) {
        if(rate >= 1 && rate <=5) {
            this.rate = rate;
        }else{
            this.rate = 0;
        }
    }

    public double getRate() {
        return rate;
    }
}
