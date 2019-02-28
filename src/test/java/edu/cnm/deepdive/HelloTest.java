package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

  @Test
  public void sayHello() {
    assertEquals("Hewwo",new Hello().sayHello());
  }
}