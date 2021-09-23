package com.ibm.elastic.document;

import io.netty.handler.codec.serialization.ObjectEncoder;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName= "audio")
@Setting(settingPath = "static/es-settings.json")
public class Audio {
    @Id
    private String id;

    @Field(type = FieldType.Text)
    private  String name;

    @Field(type = FieldType.Text)
    private  String duration;

    @Field(type = FieldType.Text)
    private  String author;

    @Field(type = FieldType.Text)
    private  String url;

    @Field(type = FieldType.Text)
    private  String format;

    @Field(type = FieldType.Object)
    private Object metadata;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}