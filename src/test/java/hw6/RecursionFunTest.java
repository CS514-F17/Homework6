package hw6;
import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionFunTest {

	@Test
	public void testCleanString1() {
		assertEquals("cleanString result incorrect for input yyzzza", "yza", RecursionFun.cleanString("yyzzza"));
	}

	@Test
	public void testCleanString2() {
		assertEquals("cleanString result incorrect for input abbbcdd", "abcd", RecursionFun.cleanString("abbbcdd"));
	}

	@Test
	public void testCleanString3() {
		assertEquals("cleanString result incorrect for input Hello Bookkeeper", "Helo Bokeper", RecursionFun.cleanString("Hello Bookkeeper"));
	}

	@Test
	public void testCleanString4() {
		assertEquals("cleanString result incorrect for input 112ab445", "12ab45", RecursionFun.cleanString("112ab445"));
	}

	@Test
	public void testChangeXY1() {
		assertEquals("changeXY result incorrect for input \"\"", "", RecursionFun.changeXY(""));
	}

	@Test
	public void testChangeXY2() {
		assertEquals("changeXY result incorrect for input codex", "codey", RecursionFun.changeXY("codex"));
	}

	@Test
	public void testChangeXY3() {
		assertEquals("changeXY result incorrect for input hiy", "hiy", RecursionFun.changeXY("hiy"));
	}

	@Test
	public void testChangeXY4() {
		assertEquals("changeXY result incorrect for input xxx", "yyy", RecursionFun.changeXY("xxx"));
	}

	@Test
	public void testarray111() {
		int[] arr = {1,  2, 11};
		assertEquals("array11 result incorrect for input [1, 2, 11], 0", 1, RecursionFun.array11(arr, 0));
	}

	@Test
	public void testarray112() {
		int[] arr = {11, 11};
		assertEquals("array11 result incorrect for input [11, 11], 0", 2, RecursionFun.array11(arr, 0));
	}

	@Test
	public void testarray113() {
		int[] arr = {1,  2, 3, 4};
		assertEquals("array11 result incorrect for input [1, 2, 3, 4], 0", 0, RecursionFun.array11(arr, 0));
	}

	@Test
	public void testarray114() {
		int[] arr = {11};
		assertEquals("array11 result incorrect for input [11], 0", 1, RecursionFun.array11(arr, 0));
	}

	@Test
	public void testarray61() {
		int[] arr = {1, 6, 4};
		assertEquals("array6 result incorrect for input [1, 6, 4], 0", true, RecursionFun.array6(arr, 0));
	}

	@Test
	public void testarray62() {
		int[] arr = {6};
		assertEquals("array6 result incorrect for input [6], 0", true, RecursionFun.array6(arr, 0));
	}

	@Test
	public void testarray63() {
		int[] arr = {2, 3, 4};
		assertEquals("array6 result incorrect for input [ 2, 3, 4], 0", false, RecursionFun.array6(arr, 0));
	}

	@Test
	public void testarray64() {
		int[] arr = {};
		assertEquals("array6 result incorrect for input [], 0", false, RecursionFun.array6(arr, 0));
	}

	@Test
	public void testTriangle1() {
		String expected = "0\n01\n012\n0123\n012\n01\n0";
		assertEquals("triangle result incorrect for input 3", expected, RecursionFun.triangle(3).trim());
	}

	@Test
	public void testTriangle2() {
		String expected = "0\n01\n0";
		assertEquals("triangle result incorrect for input 1", expected, RecursionFun.triangle(1).trim());
	}

	
}
