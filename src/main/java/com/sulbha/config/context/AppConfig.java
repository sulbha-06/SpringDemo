/*Date:28.04.2018
 * purpose: To configure Spring   
 */
package com.sulbha.config.context;

import org.springframework.context.annotation.ComponentScan;
import static com.sulbha.utility.contants.AppConstants.PACKAGES_TO_SCAN;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages=PACKAGES_TO_SCAN)
public class AppConfig {

}
