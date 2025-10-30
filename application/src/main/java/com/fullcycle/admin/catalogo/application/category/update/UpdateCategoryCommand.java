package com.fullcycle.admin.catalogo.application.category.update;

public record UpdateCategoryCommand(
        String id,
        String name,
        String description,
        boolean isActive) {

    public static UpdateCategoryCommand with(
            String anId,
            String anName,
            String aDescription,
            boolean isActive) {
        return new UpdateCategoryCommand(anId, anName, aDescription, isActive);
    }
}
