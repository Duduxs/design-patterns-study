package patterns.behavioural.chain_of_responsability.examples.first;

public class CustomerBudget {

    private boolean approved = false;

    private Float price;

    public CustomerBudget(Float price) {
        this.price = price;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerBudget{");
        sb.append("approved=").append(approved);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
