package com.codeArena.Infraestructure.Adapter.Out.Memory;

import com.codeArena.Application.Port.Out.CategoryRepositoryPort;
import com.codeArena.Domain.model.Category;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryCategoryRepositoryAdapter implements CategoryRepositoryPort {
    private final Map<Long, Category> database = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public Category save(Category category) {
        if (category.getId() == null) {
            category.setId(idGenerator.getAndIncrement());
        }
        database.put(category.getId(), category);
        return category;
    }

}
