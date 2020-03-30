package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        return Arrays.asList(
                new Post("hello", new Date()),
                new Post("bonjour", new Date()),
                new Post("arriva", new Date())
        );
    }
}
