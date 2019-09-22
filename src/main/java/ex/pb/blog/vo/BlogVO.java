package ex.pb.blog.vo;

public class BlogVO {
	private int no;
	private String blogName;
	private String type;
	private int user_no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	@Override
	public String toString() {
		return "BlogVO [no=" + no + ", blogName=" + blogName + ", type=" + type + ", user_no=" + user_no + "]";
	}
	
}
