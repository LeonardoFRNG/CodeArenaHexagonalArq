package com.codeArena.Application.Usecase;

import com.codeArena.Application.Port.In.CreateCategoryPort;
import com.codeArena.Application.Port.Out.CategoryRepositoryPort;
import com.codeArena.Domain.model.Category;

public class CreateCategoryUseCase implements CreateCategoryPort {
    private final CategoryRepositoryPort categoryRepositoryPort;

    public CreateCategoryUseCase(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public Category createCategory(Category category) {
        //Aquí irán las reglas del negocio en el futuro: ej. (validar que el nombre no este vacío etc.)

        //Le pedimos al puerto de salida que guarde la categoria
        return categoryRepositoryPort.save(category);
    }
}
