package com.ibm.elastic.controller;

import com.ibm.elastic.document.Audio;
import com.ibm.elastic.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/audio")
public class AudioController {

    private  final AudioService service;

    @Autowired
    public AudioController(AudioService service){
        this.service = service;
    }
    @PostMapping
    public  Audio save(@RequestBody final Audio audio){
        return service.create(audio);
    }
    @GetMapping("/{id}")
    public Audio findById(@PathVariable final String id){
        return service.findById(id);
    }
    @GetMapping()
    public Iterable<Audio> findAll(){
        return service.findAll();
    }
    @PutMapping("/{id}")
    public Audio update(@PathVariable final String id, @RequestBody final Audio audio ){
        return service.updateById(id,audio);
    }

    @DeleteMapping("/{id}")
    public Audio delete(@PathVariable final String id){
        return service.deleteById(id);
    }

}
