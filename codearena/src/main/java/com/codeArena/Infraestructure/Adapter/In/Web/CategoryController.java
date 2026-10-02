package com.codeArena.Infraestructure.Adapter.In.Web;

import com.codeArena.Application.Port.In.CreateCategoryPort;
import com.codeArena.Domain.model.Category;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final CreateCategoryPort createCategoryPort;

    public CategoryController(CreateCategoryPort createCategoryPort) {
        this.createCategoryPort = createCategoryPort;
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return createCategoryPort.createCategory(category);
    }
}
