package db_objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class User {

    private final int id;
    private final String username,password;
    private BigDecimal currentBalance;

//User(){
//    id=-1;username="tatyvinchu";password="hahaha";currentBalance=new BigDecimal("34542.3245");
//}
    public User(int id, String username, String password, BigDecimal currentBalance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.currentBalance = currentBalance;
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
    public void setCurrentBalance(BigDecimal newBalance ){
        currentBalance=newBalance.setScale(2, RoundingMode.FLOOR);// for seting upto 2 presisions only
    }

    public BigDecimal getCurrentBalance() {
        return this.currentBalance;
    }
}
