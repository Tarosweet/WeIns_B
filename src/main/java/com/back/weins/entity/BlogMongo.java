package com.back.weins.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "blog")
public class BlogMongo {
    @Id
    @Field
    private Integer id;

    @Field("useravatar")
    private String useravatar;

    @Field("video")
    private String video;

    @Field("base64")
    private List<String> images = new ArrayList<String>();

    @Field("label")
    private List<Label> labels = new ArrayList<Label>();

    @Field("comment")
    private List<Comment> comments = new ArrayList<Comment>();

    @Field("who_like")
    private List<Integer> who_like = new ArrayList<Integer>();
}
