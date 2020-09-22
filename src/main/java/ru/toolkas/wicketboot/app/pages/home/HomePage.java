package ru.toolkas.wicketboot.app.pages.home;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;
import ru.toolkas.wicketboot.repository.ProductRepository;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;

    @SpringBean
    private ProductRepository productRepository;

    public HomePage() {
        add(new Label("message", "Hello World!"));

        System.out.println("productRepository = " + productRepository);
    }
}
