package org.acme;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @author Franky Villadiego
 */
public class Main {

    public static void main(String[] args) {

        DefaultListableBeanFactory container = new DefaultListableBeanFactory();

        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:my-beans.xml");

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(container);
        beanDefinitionReader.loadBeanDefinitions(resource);

        Office officeBean = container.getBean(Office.class);
        officeBean.setMessageToPrint("Hola mundo!!");
        officeBean.print();
    }
}
