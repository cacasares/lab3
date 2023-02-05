import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReversed() {
    int[] input1 = {1,2,3};
    int [] output= ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{3,2,1}, output);
  }
  @Test
  public void testReversed2() {
    int[] input2 = {0 };
    assertArrayEquals(new int[]{ 0}, ArrayExamples.reversed(input2));
  }


	// @Test 
	// public void testReverseInPlace() {
  //   int[] input1 = { 3 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3 }, input1);
	// }
  // @Test 
	// public void testReverseInPlace2() {
  //   int[] input2 = { 1,2, 3,4 };
  //   ArrayExamples.reverseInPlace(input2);
  //   assertArrayEquals(new int[]{ 4,3, 2,1 }, input2);
	// }


  // @Test
  // public void testReversed() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  // }

  // @Test
  // public void testReversed2() {
  //   int[] input2 = {1,2,3};
  //   int [] output= ArrayExamples.reversed(input2);
  //   assertArrayEquals(new int[]{3,2,1}, output);
  // }

  // @Test
  // public void testAverageWithoutLowest() {
  //   double[] input3 = {2.0, 2.0, 4.0, 6.0};
  //   double output3= ArrayExamples.averageWithoutLowest(input3);
  //   assertEquals(6.0, output3, 0.00000001);
  // }
  // @Test
  // private void assertDoubleEquals(double d, double output3) {
  //   double[] input3 = {2.0, 2.0, 4.0, 6.0};
  //   double output3=ArrayExamples.averageWithoutLowest(input3);
  //   assertDoubleEquals(4.0, output3, 0.00000001);
  // }
}
