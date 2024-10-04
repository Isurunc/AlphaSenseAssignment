package model;

public class Release {
    private final int deliveryDay;
    private final int daysRequired;

    public Release(int deliveryDay, int daysRequired) {
        this.deliveryDay = deliveryDay;
        this.daysRequired = daysRequired;
    }

    public int getDeliveryDay() {
        return deliveryDay;
    }

    public int getDaysRequired() {
        return daysRequired;
    }

}
