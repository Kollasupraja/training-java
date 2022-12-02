public class pb{

    public String getPhoneBk() {
        return phoneBk;
    }

    public void setPhoneBk(String phoneBk) {
        this.phoneBk = phoneBk;
    }

    public double getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(double phoneNum) {
        this.phoneNum = phoneNum;
    }

    public pb(String phoneBk, double phoneNum) {
        this.phoneBk = phoneBk;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "pb{" +
                "phoneBk='" + phoneBk + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }

    String phoneBk;
    double phoneNum;

}