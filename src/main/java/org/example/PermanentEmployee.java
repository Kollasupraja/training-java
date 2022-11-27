package org.example;

public class PermanentEmployee extends Employee {
    int pfPercent;

    public int getPfPercent() {
        return pfPercent;
    }

    public void setPfPercent(int pfPercent) {
        this.pfPercent = pfPercent;
    }
    double salary()
    {
        double  x = pfPercent*0.01;
        sal = netsal-(x*netsal);
        System.out.println(empName);
        return sal;
    }
}
