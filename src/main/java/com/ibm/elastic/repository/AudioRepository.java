package com.ibm.elastic.repository;

import com.ibm.elastic.document.Audio;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AudioRepository extends ElasticsearchRepository<Audio, String> {

}
