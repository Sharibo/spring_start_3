package com.gmail.alexejkrawez.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Заменяет web.xml
public class SpringDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; // Аналогично web.xml прописывается путь до джава-аналога
                                                 // applicationContextMVC.xml = SpringConfig.class
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};  // Аналогично web.xml servlet-mapping
    }


}
