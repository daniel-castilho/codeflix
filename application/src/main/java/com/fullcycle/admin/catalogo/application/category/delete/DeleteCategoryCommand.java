package com.fullcycle.admin.catalogo.application.category.delete;

import com.fullcycle.admin.catalogo.domain.category.CategoryID;

public record DeleteCategoryCommand(CategoryID anId) {
}
