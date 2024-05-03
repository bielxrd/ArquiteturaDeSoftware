package Facade.RocketSeat.projetopayment.after.models;

import java.util.Date;

public class Registration {
    private String storeName;
    private Double value;
    private Date date;

    public Registration() {
    }

    public Registration(String storeName, Double value, Date date) {
        this.storeName = storeName;
        this.value = value;
        this.date = date;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "storeName='" + storeName + '\'' +
                ", value=" + value +
                ", date=" + date +
                '}';
    }
}
