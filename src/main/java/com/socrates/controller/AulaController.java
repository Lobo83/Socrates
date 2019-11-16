package com.socrates.controller;

import com.socrates.controller.mapper.AulaBusinessMapper;
import com.socrates.controller.model.AulaDTO;
import com.socrates.service.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * The type Aula controller.
 */
@Controller
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    private AulaBusinessMapper aulaBusinessMapper;
    @Autowired
    private AulaService aulaService;

    /**
     * Crear aula model and view.
     *
     * @param aulaDTO the aula dto
     * @return the model and view
     */
    @PostMapping("/crear")
    public ModelAndView crearAula(@ModelAttribute("aula")AulaDTO aulaDTO){
        ModelAndView modelAndView=new ModelAndView("createAulaPage");
        aulaDTO = aulaBusinessMapper.inverseMapping(aulaService.crearAula(aulaBusinessMapper.directMapping(aulaDTO)));
        modelAndView.addObject("aula",aulaDTO);
        return modelAndView;
    }

    /**
     * Cargar formulario model and view.
     *
     * @return the model and view
     */
    @GetMapping("/cargar_formulario_vacio")
    public ModelAndView cargarFormulario(){
        ModelAndView modelAndView=new ModelAndView("createAulaPage");
        //TODO Inicializar las sesiones disponibles y los materiales. Se necesitan consultas

        return modelAndView;
    }
    @GetMapping("/editar")
    public ModelAndView editarAula(@RequestParam("id")Long id){
        AulaDTO aulaDTO = aulaBusinessMapper.inverseMapping(aulaService.obtenerAula(id));
        ModelAndView modelAndView=new ModelAndView("createAulaPage");
        modelAndView.addObject("aula",aulaDTO);
        return modelAndView;
    }
    /**
     * Mostrar aulas model and view.
     *
     * @return the model and view
     */
    @GetMapping("/findAll")
    public ModelAndView mostrarAulas(){
        ModelAndView modelAndView=new ModelAndView("listarAulasPage");
        modelAndView.addObject("aulas",aulaBusinessMapper.inverseMapping(aulaService.obtenerAulas()));
        return modelAndView;
    }



    @GetMapping("/borrar")
    public ModelAndView borrarAula(@RequestParam("id")Long id){
        aulaService.borrarAula(id);
        return mostrarAulas();
    }
}
