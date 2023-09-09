package com.alarcon.springstreming.controladores;

import com.alarcon.springstreming.entidades.Plan;
import com.alarcon.springstreming.repositorios.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlanController {

    @Autowired
    PlanRepository planRepository;

    //READ
    @GetMapping("/suscribe/plan")
    public String listar(Model model){
        List<Plan> planes = planRepository.findAll();
        model.addAttribute("planes", planes);
        return "plan/plan";
    }
}
