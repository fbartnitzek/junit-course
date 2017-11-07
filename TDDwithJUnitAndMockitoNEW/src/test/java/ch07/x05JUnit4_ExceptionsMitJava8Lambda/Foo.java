package ch07.x05JUnit4_ExceptionsMitJava8Lambda;
//taken from: http://www.codeaffine.com/2014/07/28/clean-junit-throwable-tests-with-java-8-lambdas/
public class Foo {
	
  static final String ERR_MESSAGE = "bad";
  
  public void doIt() throws IllegalStateException {

    throw new IllegalStateException(ERR_MESSAGE);

  }

}
