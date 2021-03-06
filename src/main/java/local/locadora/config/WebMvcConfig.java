package local.locadora.config;


import local.locadora.controller.ClienteFormatter;
import local.locadora.controller.FilmeFormatter;
import local.locadora.entities.Cliente;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Spring MVC configuration.
 */
@Controller
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new ClienteFormatter());
        formatterRegistry.addFormatter(new FilmeFormatter());
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //  registry.addViewController("/home").setViewName("home");
        //   registry.addViewController("/").setViewName("home");
        registry.addViewController("/").setViewName("pages/index");
        registry.addViewController("/login").setViewName("login");
    }

}
