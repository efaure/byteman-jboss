package net.a.g;
import java.io.Serializable;

public class TestBean2 implements Serializable {

	private String hello;
	private int hi;
	private boolean toto;

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
