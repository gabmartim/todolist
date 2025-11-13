package br.com.gabrielmartim.todolist.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class FilterTaskAuth implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //Executar alguma ação
        System.out.println("Chegou no filtro!");
        filterChain.doFilter();
    }
}
