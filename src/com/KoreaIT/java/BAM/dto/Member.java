package com.KoreaIT.java.BAM.dto;

public class Member {
	String memberId;
	String pw;
	String memberName;

	public Member(String memberId, String pw, String memberName) {
		this.memberId = memberId;
		this.pw = pw;
//		this.pwCheck;
		this.memberName = memberName;
	}
}
