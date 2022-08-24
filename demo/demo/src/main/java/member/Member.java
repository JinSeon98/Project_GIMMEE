package member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user;
    private int id;
    private String pw_check;
    private String name;
    private String phone;
    private String gender;
    private String date;
    public Member(long user, int id, String pw_check, String name, String phone, String gender, String date) {
        this.user = user;
        this.id = id;
        this.pw_check = pw_check;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.date = date;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPw_check() {
        return pw_check;
    }

    public void setPw_check(String pw_check) {
        this.pw_check = pw_check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
