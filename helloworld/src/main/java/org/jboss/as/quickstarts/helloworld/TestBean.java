package org.jboss.as.quickstarts.helloworld;


public class TestBean {

	private String hello;
	private int hi;
	private boolean toto;
	private TestBean2 titi;

	public TestBean2 getTiti() {
		return titi;
	}

	public void setTiti(TestBean2 titi) {
		this.titi = titi;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public int getHi() {
		return hi;
	}

	public void setHi(int hi) {
		this.hi = hi;
	}

	public boolean isToto() {
		return toto;
	}

	public void setToto(boolean toto) {
		this.toto = toto;
	}

}
