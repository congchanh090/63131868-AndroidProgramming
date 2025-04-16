package com.example.lecongchanh_63131868_thigiuaki;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class University extends AppCompatActivity {

    private String universityName;
    private String universityImage;

    public University(String universityName, String universityImage) {
        this.universityName = universityName;
        this.universityImage = universityImage;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityImage() {
        return universityImage;
    }

    public void setUniversityImage(String universityImage) {
        this.universityImage = universityImage;
    }
}