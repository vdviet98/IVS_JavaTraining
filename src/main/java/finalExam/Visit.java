package finalExam;

import java.util.Date;

public class Visit extends Customer{
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name,Date date) {
        super(name);
        this.date = date;
        this.setMember(true);
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "name = " + this.getName() +
                ", memberType = " + this.getMemberType() +
                ", date = " + this.date +
                ", serviceExpense = " + this.serviceExpense +
                ", productExpense = " + this.productExpense +
                '}';
    }

    public double getTotalExpense() {
        return this.serviceExpense + this.productExpense;
    }


}
