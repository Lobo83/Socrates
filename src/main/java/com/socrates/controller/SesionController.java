package com.socrates.controller;

import com.socrates.controller.mapper.AulaBusinessMapper;
import com.socrates.controller.mapper.ClaseBusinessMapper;
import com.socrates.controller.mapper.SesionBusinessMapper;
import com.socrates.controller.model.ClaseDTO;
import com.socrates.controller.model.SesionDTO;
import com.socrates.service.service.AulaService;
import com.socrates.service.service.ClaseService;
import com.socrates.service.service.SesionService;
import com.socrates.service.vo.SesionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sesion")
public class SesionController {
    @Autowired
    private ClaseBusinessMapper claseBusinessMapper;
    @Autowired
    private ClaseService claseService;
    @Autowired
    private AulaBusinessMapper aulaBusinessMapper;
    @Autowired
    private AulaService aulaService;

    @Autowired
    private SesionService sesionService;
    @Autowired
    private SesionBusinessMapper sesionBusinessMapper;
    /**
     * Crear aula model and view.
     *
     * @param sesionDTO the aula dto
     * @return the model and view
     */
    @PostMapping("/crear")
    public ModelAndView crearClase(@ModelAttribute("sesion") SesionDTO sesionDTO) {
        ModelAndView modelAndView = new ModelAndView("createSesionPage");
        SesionVO sesionVO = sesionBusinessMapper.directMapping(sesionDTO);
        sesionVO.setClase(claseService.obtenerClase(sesionDTO.getIdClase()));
        sesionVO.setAula(aulaService.obtenerAula(sesionDTO.getIdAula()));
        modelAndView.addObject("sesion",sesionService.crearSesion(sesionVO));
        return modelAndView;
    }

    /**
     * Cargar formulario model and view.
     *
     * @return the model and view
     */
    @GetMapping("/cargar_formulario_vacio")
    public ModelAndView cargarFormulario() {
        ModelAndView modelAndView = new ModelAndView("createSesionPage");
        modelAndView.addObject("clases", claseBusinessMapper.inverseMapping(claseService.obtenerClases()));
        modelAndView.addObject("aulas",aulaBusinessMapper.inverseMapping(aulaService.obtenerAulas()));
        return modelAndView;
    }

    /**
     * Mostrar aulas model and view.
     *
     * @return the model and view
     */
    @GetMapping("/findAll")
    public ModelAndView mostrarSesiones() {
        ModelAndView modelAndView = new ModelAndView("listarClasesPage");
        modelAndView.addObject("clases", claseBusinessMapper.inverseMapping(claseService.obtenerClases()));
        return modelAndView;
    }

    @GetMapping("/editar")
    public ModelAndView editarSesion(@RequestParam("id") Long id) {
        ClaseDTO claseDTO = claseBusinessMapper.inverseMapping(claseService.obtenerClase(id));
        ModelAndView modelAndView = new ModelAndView("createSesionPage");
//        modelAndView.addObject("clase", claseDTO);
//        modelAndView.addObject("profesores", obtenerProfesores());
//        modelAndView.addObject("materias", obtenerMaterias());
        return modelAndView;
    }

    @GetMapping("/borrar")
    public ModelAndView borrarSesion(@RequestParam("id") Long id) {
        sesionService.borrarSesion(id);
        return mostrarSesiones();
    }


}
