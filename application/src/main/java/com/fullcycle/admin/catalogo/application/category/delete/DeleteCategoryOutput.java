package com.fullcycle.admin.catalogo.application.category.delete;

import com.fullcycle.admin.catalogo.domain.category.CategoryID;

public record DeleteCategoryOutput(CategoryID id) {

    public static DeleteCategoryOutput from(final CategoryID aId) {
        return new DeleteCategoryOutput(aId);
    }
}
