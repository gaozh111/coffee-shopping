package com.shopping.pojo;

import java.util.List;

/**
 * @ClassName User
 * @Description TODO
 * @Author Zhaohui.Gao
 * @DateTime 2019/7/23 10:57
 * @Version 1.0
 **/
public class User {
    /**
     * 用户id
     */
    private int id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 用户电话
     */
    private String telephone;
    /**
     * 用户会员等级
     */
    private int vip;
    /**
     * 用户积分
     */
    private double point;
    /**
     * 用户余额
     */
    private double balance;
    /**
     * 用户头像
     */
    private String headImage;
    /**
     * 用户状态
     */
    private String userStatus;
    /**
     * 用户地址
     */
    private List<UserAddress> userAddressList;

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public List<UserAddress> getUserAddressList() {
        return userAddressList;
    }

    public void setUserAddressList(List<UserAddress> userAddressList) {
        this.userAddressList = userAddressList;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
