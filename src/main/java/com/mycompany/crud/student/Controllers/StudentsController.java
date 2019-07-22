/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crud.student.Controllers;

import com.mycompany.crud.student.StudentService.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class StudentsController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        return "index";
    }

    StudentService sServ = new StudentService();
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String getTrainers(ModelMap model) {
        model.addAttribute("list", sServ.getTrainers());
        return "students";
    }

//    @RequestMapping(value = "/trainerlist/addTrainer", method = RequestMethod.GET)
//    public String addTrainer(ModelMap model,
//            @RequestParam("name") String name,
//            @RequestParam("surname") String lname,
//            @RequestParam("subject") String subject
//    ) {
//        Trainer tr = new Trainer(name, lname, subject);
//        tServ.InsertTrainer(tr);
//        model.addAttribute("list", tServ.getTrainers());
//        return "trainerlist";
//    }
//
//    @RequestMapping(value = "/trainerlist/update/{id}", method = RequestMethod.GET)
//    public String updateTrainer(ModelMap model, @PathVariable Integer id) {
//        model.addAttribute("greeting", "Trainers").addAttribute("list", tServ.getTrainers());
//        model.addAttribute("id", "This is the id from the path: " + id);
//        return "trainers";
//    }
//
//    @RequestMapping(value = "/trainerlist/delete/{id}", method = RequestMethod.GET)
//    public String deleteTrainer(ModelMap model, @PathVariable Integer id) {
//        model.addAttribute("greeting", "Trainers").addAttribute("list", tServ.getTrainers());
//        model.addAttribute("id", "This is the id from the path: " + id);
//        return "trainers";
//    }

}
