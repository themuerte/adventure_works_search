package com.example.adventure_works_search;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link AdventureWorksSearchApplication}.
 */
@Generated
public class AdventureWorksSearchApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'adventureWorksSearchApplication'.
   */
  public static BeanDefinition getAdventureWorksSearchApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AdventureWorksSearchApplication.class);
    beanDefinition.setTargetType(AdventureWorksSearchApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(AdventureWorksSearchApplication.class);
    beanDefinition.setInstanceSupplier(AdventureWorksSearchApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
