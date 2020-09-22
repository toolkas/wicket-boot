package ru.toolkas.wicketboot.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "wicket.wicket-boot", initParams = {
        @WebInitParam(name = "applicationClassName", value = "ru.toolkas.wicketboot.app.WicketApplication")
}, urlPatterns = "/*")
public class AppFilter extends org.apache.wicket.protocol.http.WicketFilter {
    @Override
    public void init(boolean isServlet, FilterConfig filterConfig) throws ServletException {
        super.init(isServlet, filterConfig);

        System.out.println("INIT");
    }
}
