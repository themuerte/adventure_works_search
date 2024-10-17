package com.example.adventure_works_search.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link mainController}.
 */
@Generated
public class mainController__BeanDefinitions {
  /**
   * Get the bean definition for 'mainController'.
   */
  public static BeanDefinition getMainControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(mainController.class);
    beanDefinition.setInstanceSupplier(mainController::new);
    return beanDefinition;
  }
}
