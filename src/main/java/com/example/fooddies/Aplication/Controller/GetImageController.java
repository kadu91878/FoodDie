package com.example.fooddies.Aplication.Controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/burgers")
public class GetImageController {
    // ...

    @GetMapping("/images/{imageName}")
    public ResponseEntity<Resource> getImage(@PathVariable String imageName) {
        try {
            // Define the path to the image file
            String imagePath = "/home/kadu/Projetos/Fooddies/api/FoodDie/src/main/java/com/example/fooddies/Images/" + imageName;

            // Create a Path object from the image file path
            Path imagePathObj = Paths.get(imagePath);

            // Check if the file exists
            if (Files.exists(imagePathObj)) {
                // Create a Resource object from the image file
                Resource imageResource = new FileSystemResource(imagePathObj);

                // Return the image resource with the appropriate content type
                return ResponseEntity.ok()
                        .contentType(MediaType.IMAGE_JPEG)
                        .body(imageResource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }
}