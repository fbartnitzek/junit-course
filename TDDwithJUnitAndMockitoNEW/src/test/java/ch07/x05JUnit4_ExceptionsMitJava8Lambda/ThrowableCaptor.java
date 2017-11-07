package ch07.x05JUnit4_ExceptionsMitJava8Lambda;

public class ThrowableCaptor {

  public interface Actor {
    void act() throws Throwable;
  }

  public static Throwable captureThrowable( Actor actor ) {
    Throwable result = null;
    try {
      actor.act();
    } catch( Throwable throwable ) {
      result = throwable;
    }
    return result;
  }

}
