package vo;

import java.sql.Date;

public class BoardBean { // DB 에서 사용할 항목들 한 객체 넣어 편하게 사용하기 위해서

	private int board_num;
	private String board_name;
	private String board_pass;
	private String board_subject;
	private String board_content;
	private String board_file;
	
	private int re_ref;
	private int re_lev;
	private int re_step;
	
	private int board_readcount;
	private Date board_date;
	
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_pass() {
		return board_pass;
	}
	public void setBoard_pass(String board_pass) {
		this.board_pass = board_pass;
	}
	public String getBoard_subject() {
		return board_subject;
	}
	public void setBoard_subject(String board_subject) {
		this.board_subject = board_subject;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_file() {
		return board_file;
	}
	public void setBoard_file(String board_file) {
		this.board_file = board_file;
	}
	public int getRe_ref() {
		return re_ref;
	}
	public void setRe_ref(int re_ref) {
		this.re_ref = re_ref;
	}
	public int getRe_lev() {
		return re_lev;
	}
	public void setRe_lev(int re_lev) {
		this.re_lev = re_lev;
	}
	public int getRe_step() {
		return re_step;
	}
	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}
	public int getBoard_readcount() {
		return board_readcount;
	}
	public void setBoard_readcount(int board_readcount) {
		this.board_readcount = board_readcount;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	@Override
	public String toString() {
		return "BoardBean [board_num=" + board_num + ", board_name=" + board_name + ", board_pass=" + board_pass
				+ ", board_subject=" + board_subject + ", board_content=" + board_content + ", board_file=" + board_file
				+ ", re_ref=" + re_ref + ", re_lev=" + re_lev + ", re_step=" + re_step + ", board_readcount="
				+ board_readcount + ", board_date=" + board_date + "]";
	}
	
	
}
