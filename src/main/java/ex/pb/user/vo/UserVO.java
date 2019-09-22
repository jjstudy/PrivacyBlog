package ex.pb.user.vo;

import java.util.Arrays;

public class UserVO {
	int    no;
	String id;
	String nickName;
	String password;
	String email;
	String address;
	byte[] profile;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte[] getProfile() {
		return profile;
	}
	public void setProfile(byte[] profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "UserVO [no=" + no + ", id=" + id + ", nickName=" + nickName + ", password=" + password + ", email="
				+ email + ", address=" + address + ", profile=" + Arrays.toString(profile) + "]";
	}

	
}
