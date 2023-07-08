package com.example.fooddies.Aplication.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadImageController {

    @Value("${upload.folder.path}") // Specify the folder path where you want to save the images in your application.properties file
    private String uploadFolderPath;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new ResponseEntity<>("Please select a file to upload.", HttpStatus.BAD_REQUEST);
        }

        try {
            String fileName = file.getOriginalFilename();
            assert fileName != null;
            String filePath = uploadFolderPath + File.separator + fileName;
            File dest = new File(filePath);
            file.transferTo(dest);
            return new ResponseEntity<>("Image uploaded successfully.", HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("Failed to upload the image.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

