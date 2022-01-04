/**
 * 
 */
package com.nitere;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author riverplant
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WorkshopApplication.class)
@Transactional
public class BaseTest {

}
