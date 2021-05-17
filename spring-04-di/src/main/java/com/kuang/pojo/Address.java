package com.kuang.pojo;

/**
 * @author Willam_xh
 * @create 2021-05-10 15:10
 */
public class Address {
    private String address;

    public Address() {
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
