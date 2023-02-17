/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class Insurance {
    public static int counter=89;
    private int planId;
    private String planName;
    private int costPerMonth;
    private int costPerAnnum;
    
    public Insurance(){
    }

    public Insurance( String planName, double costPerMonth) {
        this.planId=counter;
        counter++;
//        this.planId = planId;
        this.planName = planName;
        System.out.println(this.planName);
        this.costPerMonth=(int) costPerMonth;
        System.out.println(this.costPerMonth);
        this.costPerAnnum=this.costPerMonth*12;

    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Insurance.counter = counter;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(int costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public int getCostPerAnnum() {
        return costPerAnnum;
    }
    @Override
    public String toString(){
        return String.valueOf(this.getPlanId());
    }
       
}
