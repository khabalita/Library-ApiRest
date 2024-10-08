package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.dto.CategoryDto;
import com.khabalita.springboot.libraryApi.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api-library/categories")
public class CategoryController{

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/createCategory")
    public ResponseEntity<?> createCategory(@RequestBody @Valid CategoryDto categoryDto) throws Exception{
        categoryService.newCategory(categoryDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getOne/{id}")
    @ResponseBody
    public ResponseEntity<?> getCategory(@PathVariable Long id) throws Exception{
        CategoryDto categoryDto = categoryService.findCategoryById(id);
        if(categoryDto != null){
            return ResponseEntity.status(HttpStatus.OK).body(categoryDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("");
        }

    }

    @GetMapping("/listCategories")
    @ResponseBody
    public ResponseEntity<?> getAllCategories() throws Exception{
        List<CategoryDto> categoryDtoList = categoryService.listAllCategories();
        return ResponseEntity.status(HttpStatus.OK).body(categoryDtoList);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable Long id, @RequestBody @Valid CategoryDto categoryDto) throws Exception{
        CategoryDto updatedCategory = categoryService.updateCateoory(id, categoryDto);
        if(updatedCategory != null){
            return ResponseEntity.status(HttpStatus.OK).body(updatedCategory);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Category not found}");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long id) throws Exception{
        boolean deleted = categoryService.deleteCategory(id);
        if(deleted){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Category not found");
        }
    }

}
