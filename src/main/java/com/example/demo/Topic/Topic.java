package com.example.demo.Topic;

    public class Topic{
        public int size;
        private String id;
        private String name;
        private String surname;

        public Topic(){}

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public Topic(String id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }
    }


