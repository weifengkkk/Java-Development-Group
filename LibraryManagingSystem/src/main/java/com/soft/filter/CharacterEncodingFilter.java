package com.soft.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 	字符过滤器
 * 	@author Mingyue
 *
 */

public class CharacterEncodingFilter implements Filter {
	
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }


}


