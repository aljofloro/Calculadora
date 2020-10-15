package com.miempresa.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

  private Calculadora calculadora;

  @Before
  public void setUp(){
    calculadora = new Calculadora();
  }

  @Test
  public void addition_isCorrect() {
    double resultadoSuma = calculadora
        .suma(3d,3d);
    assertThat(resultadoSuma,is(equalTo(6d)));
  }

  @Test
  public void substraction_isCorrect(){
    double resultadoResta = calculadora
        .resta(4d,1d);
    assertThat(resultadoResta,is(equalTo(3d)));
  }
}