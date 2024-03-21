package com.scaler.onetomany;

import com.scaler.onetomany.entity.Comment;
import com.scaler.onetomany.entity.Post;
import com.scaler.onetomany.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OnetomanyApplication.class, args);
    }
    @Autowired
    private PostRepository postRepository;
    @Override
    public void run(String... args) throws Exception {

        Post post = new Post("World is fine","Awesome Work");
        Comment comment1 = new Comment("Awesome");
        Comment comment2 = new Comment("Beautiful");
        Comment comment3 = new Comment("Well Done");

        post.getComments().add(comment1);
        post.getComments().add(comment2);
        post.getComments().add(comment3);

        this.postRepository.save(post);
    }
}
