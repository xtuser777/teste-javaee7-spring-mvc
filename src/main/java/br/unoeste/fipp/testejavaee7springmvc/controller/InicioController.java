package br.unoeste.fipp.testejavaee7springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {

    @RequestMapping(value = {"/", "/inicio", "/inicio/index"}, method = RequestMethod.GET)
    public ModelAndView indexAction() {
        ModelAndView view = new ModelAndView("inicio/index");
        view.addObject("msg", "Testando!!");
        return view;
    }

}
