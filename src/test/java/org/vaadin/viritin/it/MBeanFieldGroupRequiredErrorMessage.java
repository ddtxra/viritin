package org.vaadin.viritin.it;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;
import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.viritin.BeanBinder;
import org.vaadin.viritin.layouts.MVerticalLayout;
import org.vaadin.viritin.testdomain.Address;

/**
 * Created by marco on 07/05/16.
 */
@Theme("valo")
public class MBeanFieldGroupRequiredErrorMessage extends AbstractTest {

    private TextField street ;


    @Override
    public Component getTestComponent() {
        street = new TextField();
        street.setLocale(getLocale());
        street.setId("txtStreet");
        BeanBinder.bind(new Address(),this);
        return new MVerticalLayout(street);
    }
}
