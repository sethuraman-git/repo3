package org.gitpac;

public class GitClass {
	private void br2() {
		System.out.println("br2");
	}
	public static void main(String[] args) {
		System.out.println("master");

		GitClass g = new GitClass();
		g.br2();

		System.out.println("branch1");

	}

}
