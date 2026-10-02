package com.codeArena.Infraestructure.Config;

import com.codeArena.Application.Port.Out.CategoryRepositoryPort;
import com.codeArena.Application.Usecase.CreateCategoryUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {

    @Bean
    public CreateCategoryUseCase createCategoryUseCase(CategoryRepositoryPort categoryRepositoryPort){
        return new CreateCategoryUseCase(categoryRepositoryPort);
    }
}
