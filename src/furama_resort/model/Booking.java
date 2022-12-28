package furama_resort.model;

import furama_resort.model.facility.Facility;
import furama_resort.model.person.Customer;

public abstract class Booking {
    private String bookingCode;
    private String dayIn;
    private String dayOut;
    private int idCustomer;
    private String serviceName;

    public Booking() {
    }

    public Booking(String bookingCode, String dayIn, String dayOut, int idCustomer, String serviceName) {
        this.bookingCode = bookingCode;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", dayIn='" + dayIn + '\'' +
                ", dayOut='" + dayOut + '\'' +
                ", idCustomer=" + idCustomer +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
