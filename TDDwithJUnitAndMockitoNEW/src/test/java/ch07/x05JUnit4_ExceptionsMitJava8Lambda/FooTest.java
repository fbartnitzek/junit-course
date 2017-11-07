package ch07.x05JUnit4_ExceptionsMitJava8Lambda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
public class FooTest {
 

  @Test
  public void testException() {
    // arrange
    Foo foo = new Foo();
    // act
//    Throwable actual = ThrowableCaptor.captureThrowable( foo::doIt );
    Throwable actual = ThrowableCaptor.captureThrowable( ()->{foo.doIt();} );
    
    // assert
    assertTrue(actual instanceof IllegalStateException);
    assertTrue(actual.getMessage() != null);
    assertEquals(Foo.ERR_MESSAGE, actual.getMessage());
//    assertThat( actual )
//      .isInstanceOf( IllegalStateException.class )
//      .hasMessage( Foo.ERR_MESSAGE );

  }

}

