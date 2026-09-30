package com.codeArena.Application.Port.In;

import com.codeArena.Domain.model.Category;

public interface CreateCategoryPort {
    Category createCategory(Category category);
}
