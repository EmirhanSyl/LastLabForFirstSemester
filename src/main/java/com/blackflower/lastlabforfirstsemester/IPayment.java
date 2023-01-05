package com.blackflower.lastlabforfirstsemester;

/**
 *
 * @author emirs
 */
public interface IPayment {
    void paymentSalary(int net, int tax);
    int getTotalPayment();
}
