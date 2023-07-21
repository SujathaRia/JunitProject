package Junits;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import code.StringFunctions;

import org.junit.jupiter.api.Assertions;

public class DynamicTestsExample {
	
	@TestFactory
	public Collection<DynamicTest> method1() {

		return Arrays.asList(

				DynamicTest.dynamicTest("Positive Test",
						() -> Assertions.assertTrue(StringFunctions.isPalindrome("madam"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFunctions.isPalindrome("nikunj"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFunctions.isPalindrome("shivani")))

		);

	}

}
