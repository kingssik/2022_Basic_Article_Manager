package com.KoreaIT.java.BAM.controller;

import com.KoreaIT.java.BAM.dto.Member;

public abstract class Controller {

	public static Member loginedMember;	// 공공재 느낌 

	public abstract void doAction(String cmd, String actionMethodName);

	public abstract void makeTestData();

	public static boolean isLogined() {
		return loginedMember != null;
	}

}