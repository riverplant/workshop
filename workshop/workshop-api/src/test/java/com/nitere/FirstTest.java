/**
 * 
 */
package com.nitere;

import java.util.Optional;

import org.junit.jupiter.api.Test;





/**
 * @author riverplant
 *
 */
public class FirstTest extends BaseTest {

	@Test
	public void hello() {
		Optional.of("hello").ifPresent(System.out::println);
	}
}
