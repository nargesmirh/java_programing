import java.io.Serializable;

public class Entity implements Serializable {
    private int id, balance;
    private String user, pass;
    public int getId() {
        return id;
    }
    public Entity setId(int id) {
        this.id = id;
        return this;
    }
    public String getUser() {
        return user;
    }
    public Entity setUser(String user) {
        this.user = user;
        return this;
    }
    public String getPass() {
        return pass;
    }
    public Entity setPass(String pass) {
        this.pass = pass;
        return this;
    }
    public int getBalance() {
        return balance;
    }
    public Entity setBalance(int balance) {
        this.balance = balance;
        return this;
    }
}