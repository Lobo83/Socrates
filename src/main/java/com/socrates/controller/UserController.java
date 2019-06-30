package com.socrates.controller;

import com.socrates.controller.mapper.PersonaBusinessMapper;
import com.socrates.controller.mapper.UserBusinessMapper;
import com.socrates.controller.model.UserDTO;
import com.socrates.service.service.PersonaService;
import com.socrates.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * The type User controller.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserBusinessMapper userBusinessMapper;

    @Autowired
    private PersonaService personaService;
    @Autowired
    private PersonaBusinessMapper personaBusinessMapper;

    /**
     * Determinar user page string.
     *
     * @param authentication the authentication
     * @return the string
     */
    @GetMapping(value = "/userPage")
    public String determinarUserPage(Authentication authentication) {
        String pagina = "index";
        //verificación de que la sesion es valida
        if (null != authentication && authentication.getAuthorities().size() > 0) {
            List<GrantedAuthority> roles = (List<GrantedAuthority>) authentication.getAuthorities();
            GrantedAuthority role = roles.get(0);
            switch (role.getAuthority()) {
                case "ROLE_ADMIN":
                    pagina = "adminPage";
                    break;
                case "ROLE_PROFESOR":
                    pagina = "profesorPage";
                    break;
                case "ROLE_ALUMNO":
                    pagina = "alumnoPage";
                    break;
                default:
                    break;

            }
        }
        return pagina;
    }

    /**
     * Create user model and view.
     *
     * @param userDTO the user dto
     * @return the model and view
     */
    @PostMapping(value = "/create")
    public ModelAndView createUser(@ModelAttribute("user") UserDTO userDTO) {
        //TODO Esto realmente debería ir por configuracion pero bueno. poco a poco
        List<String> roles = userDTO.getRoles();
        for (int i = 0; i < roles.size(); i++) {
            String rol = roles.get(i);
            roles.set(i, "ROLE_" + rol.toUpperCase());
        }
        userService.crearUsuario(userBusinessMapper.directMapping(userDTO));
        ModelAndView modelAndView = new ModelAndView("view/createUserPage");
        modelAndView.addObject("user", userDTO);
        return modelAndView;
    }

    /**
     * Listar usuarios model and view.
     *
     * @return the model and view
     */
    @GetMapping(value = "/findAll")
    public ModelAndView listarUsuarios() {
        ModelAndView modelAndView = new ModelAndView("listarUsuariosPage");
        List<UserDTO> userDTOS = userBusinessMapper.inverseMapping(userService.obtenerUsuarios());

        modelAndView.addObject("usersList", userDTOS);
        return modelAndView;
    }

}
