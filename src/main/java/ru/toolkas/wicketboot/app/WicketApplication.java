package ru.toolkas.wicketboot.app;

import org.apache.wicket.Page;
import org.apache.wicket.application.IComponentInitializationListener;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.toolkas.wicketboot.app.pages.home.HomePage;

public class WicketApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
        super.init();
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }
}
