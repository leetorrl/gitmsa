package com.pmh.ex11.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MYFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("필터 생성될때 호출되는 메서드");
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        System.out.println("필터 멈출때 호출되는 메서드 ㅎㅎ");
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("지나갈때 호출되는 메서드");
        System.out.println(servletRequest.getParameter("test"));

        filterChain.doFilter(servletRequest, servletResponse);

    }


}
