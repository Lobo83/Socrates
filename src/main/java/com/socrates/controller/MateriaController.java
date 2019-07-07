package com.socrates.controller;

import com.socrates.controller.mapper.MateriaBusinessMapper;
import com.socrates.controller.model.MateriaDTO;
import com.socrates.service.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    private MateriaBusinessMapper materiaBusinessMapper;
    @Autowired
    private MateriaService materiaService;

    /**
     * Crear aula model and view.
     *
     * @param materiaDTO the aula dto
     * @return the model and view
     */
    @PostMapping("/crear")
    public ModelAndView crearAula(@ModelAttribute("materia")MateriaDTO materiaDTO){
        ModelAndView modelAndView=new ModelAndView("createMateriaPage");
        materiaDTO = materiaBusinessMapper.inverseMapping(materiaService.crearMateria(materiaBusinessMapper.directMapping(materiaDTO)));
        modelAndView.addObject("materia",materiaDTO);
        return modelAndView;
    }

    /**
     * Cargar formulario model and view.
     *
     * @return the model and view
     */
    @GetMapping("/cargar_formulario_vacio")
    public ModelAndView cargarFormulario(){
        ModelAndView modelAndView=new ModelAndView("createMateriaPage");
        //TODO Inicializar las sesiones disponibles y los materiales. Se necesitan consultas

        return modelAndView;
    }

    /**
     * Mostrar aulas model and view.
     *
     * @return the model and view
     */
    @GetMapping("/findAll")
    public ModelAndView mostrarAulas(){
        ModelAndView modelAndView=new ModelAndView("listarMateriasPage");
        modelAndView.addObject("materias", materiaBusinessMapper.inverseMapping(materiaService.obtenerMaterias()));
        return modelAndView;
    }

    @GetMapping("/editar")
    public ModelAndView editarAula(@RequestParam("id")Long id){
        MateriaDTO materiaDTO = materiaBusinessMapper.inverseMapping(materiaService.obtenerMateria(id));
        ModelAndView modelAndView=new ModelAndView("createMateriaPage");
        modelAndView.addObject("materia",materiaDTO);
        return modelAndView;
    }

    @GetMapping("/borrar")
    public ModelAndView borrarAula(@RequestParam("id")Long id){
        materiaService.borrarMateria(id);
        return mostrarAulas();
    }
}
