package com.bjsxt.pojo;

/**
 * @Auther: Mystery
 * @Date: 2020/1/24
 * @Description: com.bjsxt
 * @version: 1.0
 */
public class Users {
    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getUserage() {
        return userage;
    }
    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }
}
