package com.permission.pojo;

/**
 * 用户扩展信息表
 * @author milanyangbo
 *
 */
public class UserExt {
	/**
	 * 用户ID
	 */
    private Integer id;

    /**
	 * 电子邮件
	 */
    private String email;

    /**
	 * 固定电话
	 */
    private String phone;

    /**
	 * 移动电话
	 */
    private String mobile;

    /**
	 * 联系地址
	 */
    private String address;

    /**
	 * 邮编
	 */
    private String zip;

    /**
	 * 生日
	 */
    private String birthday;

    /**
	 *  身份证号
	 */
    private String idcard;

    /**
	 * QQ
	 */
    private String qq;

    /**
	 * 用户头像流文件ID
	 */
    private Integer bytearrayid;

    /**
	 * 静态扩展字段1
	 */
    private String field1;

    /**
	 * 静态扩展字段2
	 */
    private String field2;

    /**
	 *  静态扩展字段3
	 */
    private String field3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getBytearrayid() {
        return bytearrayid;
    }

    public void setBytearrayid(Integer bytearrayid) {
        this.bytearrayid = bytearrayid;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }
}