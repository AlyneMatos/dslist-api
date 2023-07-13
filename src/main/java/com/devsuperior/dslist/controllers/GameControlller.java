package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.ClassCastException;
@RestController
@RequestMapping(value = "/games")

public class GameControlller {
    @Autowired
    private GameService gameservice;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameservice.findById(id);
        return result;
    }
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameservice.findAll();
        return result;
    }
}
