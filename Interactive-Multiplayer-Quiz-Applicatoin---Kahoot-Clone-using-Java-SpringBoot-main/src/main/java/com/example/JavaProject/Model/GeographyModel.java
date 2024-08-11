package com.example.JavaProject.Model;

import org.springframework.data.annotation.Id;

import java.util.List;

public record GeographyModel(

        @Id
        int ID,
        int GenereID,
        String Question,
        List<String> Options,
        String CorrectAnswer
) {}
