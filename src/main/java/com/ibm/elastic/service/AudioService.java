package com.ibm.elastic.service;

import com.ibm.elastic.document.Audio;
import com.ibm.elastic.repository.AudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudioService {
    private final AudioRepository repository;

    @Autowired
    public AudioService(AudioRepository repository){
        this.repository = repository;
    }

    public Audio create( final Audio audio){
        return repository.save(audio);
    }

    public  Audio findById(final String id){
        return  repository.findById(id).orElse(null);
    }

    public Iterable<Audio> findAll(){
        return repository.findAll();
    }

    public Audio updateById(final String id, final Audio audioBody){
        Audio audio = repository.findById(id).orElse(null);
        audio.setName(audioBody.getName());
        audio.setAuthor(audioBody.getAuthor());
        audio.setDuration(audioBody.getDuration());
        audio.setFormat(audioBody.getFormat());
        audio.setUrl(audioBody.getUrl());
        Audio updated = repository.save(audio);
        return updated;
    }

    public Audio deleteById(final String id){
        Audio audio = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return audio;

    }
}
