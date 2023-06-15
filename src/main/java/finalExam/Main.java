package finalExam;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Visit premium = new Visit("Premium", new Date());
        premium.setMemberType("Premium");
        premium.setProductExpense(100);
        premium.setServiceExpense(100);

        double totalDiscount = premium.getServiceExpense() * DiscountRate.getServiceDiscountRate(premium.getMemberType())
                    + premium.getProductExpense() * DiscountRate.getProductDiscountRate(premium.getMemberType()) ;

        double paid = premium.getTotalExpense() - totalDiscount;

        System.out.println(premium);
        System.out.println("==> PAID: " + paid);
    }
}
