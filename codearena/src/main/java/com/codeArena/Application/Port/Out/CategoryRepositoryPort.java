package com.codeArena.Application.Port.Out;

import com.codeArena.Domain.model.Category;

public interface CategoryRepositoryPort {
    Category save(Category category);
}
