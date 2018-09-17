package com.blog.blog.models;

import javax.persistence.*;
import java.util.List;

    @Entity
    @Table(name="user")
    public class User {

        @Id @GeneratedValue
        private long id;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Column(nullable = false, unique = true)
        private String username;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private String password;

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
        private List<Post> posts;


        public User(long id, String username, String email, String password, String firstName, String lastName) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
        }

        public User(String username, String email, String password, String firstName, String lastName) {
            this.username = username;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
        }

        public User(User copy) {
            id = copy.id;
            username = copy.username;
            email = copy.email;
            firstName = copy.firstName;
            lastName = copy.lastName;
            password = copy.password;
        }

        public User() {}

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String username) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<Post> getPosts() {
            return posts;
        }

        public void setPosts(List<Post> posts) {
            this.posts = posts;
        }
}
