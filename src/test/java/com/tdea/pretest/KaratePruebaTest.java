package com.tdea.pretest;

import com.intuit.karate.junit5.Karate;

public class KaratePruebaTest {

	@Karate.Test
	public Karate TestKarate() {
		return Karate.run("classpath:com.tdea.pretest/karatefolder/user.feature");
	}
}
