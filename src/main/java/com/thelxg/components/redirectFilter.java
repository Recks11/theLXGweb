package com.thelxg.components;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rex on 08/06/2017.
 */
@Component
public class redirectFilter implements Filter {


    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
            throws IOException, ServletException {
        if (arg0 instanceof HttpServletRequest) {
            HttpServletRequest req = (HttpServletRequest) arg0;
            String url = req.getRequestURL().toString();//+"?"+req.getQueryString();
            Pattern p = Pattern.compile("(?i)(http(s?)://)www\\.");
            Matcher m = p.matcher(url);
            if (m.find()) {
                //www is present -> continue
                chain.doFilter(arg0, arg1);
            } else {
                StringBuilder wwwurl = new StringBuilder();
                if (url.toLowerCase().startsWith("http://")) {
                    wwwurl.append("http://www.").append(url.substring(7));
                } else if (url.toLowerCase().startsWith("https://")) {
                    wwwurl.append("https://www.").append(url.substring(8));
                }
                ((HttpServletResponse) arg1).sendRedirect(wwwurl.toString());
            }
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }
}
